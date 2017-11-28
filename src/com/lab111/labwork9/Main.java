package com.lab111.labwork9;

import com.lab111.labwork9.builder.FullJoinBuilder;
import com.lab111.labwork9.builder.JoinBuilder;
import com.lab111.labwork9.models.*;
import com.lab111.labwork9.models.tables.DogTable;
import com.lab111.labwork9.models.tables.HouseTable;
import com.lab111.labwork9.models.tables.HumanTable;
import com.lab111.labwork9.models.JoinedElement;
import com.lab111.labwork9.models.tables.Table;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human("Igor", 18);
        Human h2 = new Human("Vasia", 19);

        Dog d1 = new Dog("Archi", "Terier", 3);
        Dog d2 = new Dog("Archibald", "Corgi", 2);
        Dog d3 = new Dog("Richy", "Alabai", 2);

        House house1 = new House("White house", "Kyiv");
        House house2 = new House("Black house", "Kyiv");

        Table humans = new HumanTable();
        humans.add(h1);
        humans.add(h2);

        Table dogs = new DogTable();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        Table houses = new HouseTable();
        houses.add(house1);
        houses.add(house2);

        JoinBuilder fullJoinBuilder = new FullJoinBuilder();

        fullJoinBuilder.addTable(humans);
        fullJoinBuilder.addTable(dogs);
        fullJoinBuilder.addTable(houses);

        Table<JoinedElement> joined = fullJoinBuilder.join();

        System.out.println(joined.getFieldNames());

        System.out.println(joined.size());
    }

}

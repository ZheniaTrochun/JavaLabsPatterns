package com.lab111.labwork9.models;

public class Dog implements TableElement {

    private int id;
    private String name;
    private String species;
    private int age;

    private static int lastId = 0;

    public Dog(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.id = ++lastId;
    }

    public Dog() {
    }

    @Override
    public String getFieldNames() {
        return "Dog.Id, Dog.Name, Dog.Species, Dog.Age";
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

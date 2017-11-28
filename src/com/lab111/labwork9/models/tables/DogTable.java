package com.lab111.labwork9.models.tables;

import com.lab111.labwork9.models.Dog;

public class DogTable extends Table<Dog> {
    @Override
    public String getFieldNames() {
        return new Dog().getFieldNames();
    }
}

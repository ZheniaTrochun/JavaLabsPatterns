package com.lab111.labwork9.models.tables;

import com.lab111.labwork9.models.Human;

public class HumanTable extends Table<Human> {
    @Override
    public String getFieldNames() {
        return new Human().getFieldNames();
    }
}

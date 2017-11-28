package com.lab111.labwork9.models.tables;

import com.lab111.labwork9.models.House;

public class HouseTable extends Table<House> {
    @Override
    public String getFieldNames() {
        return new House().getFieldNames();
    }
}

package com.lab111.labwork9.models.tables;

import com.lab111.labwork9.models.JoinedElement;

public class JoinResults extends Table<JoinedElement> {

    @Override
    public String getFieldNames() {

        return rows.isEmpty() ? "Empty table" : rows.get(0).getFieldNames();
    }
}

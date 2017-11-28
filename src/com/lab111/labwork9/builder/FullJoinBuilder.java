package com.lab111.labwork9.builder;

import com.lab111.labwork9.models.tables.JoinResults;
import com.lab111.labwork9.models.JoinedElement;
import com.lab111.labwork9.models.tables.Table;
import com.lab111.labwork9.models.TableElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FullJoinBuilder implements JoinBuilder {
    private List<Table<? extends TableElement>> tablesForJoining;

    public FullJoinBuilder() {
        tablesForJoining = new ArrayList<>();
    }

    @Override
    public boolean addTable(Table<? extends TableElement> table) {
        return tablesForJoining.add(table);
    }

    @Override
    public JoinResults join() {

        if (tablesForJoining.size() == 1) {
            JoinResults res = new JoinResults();
            tablesForJoining.get(0).getAll()
                    .forEach(r -> res.add(new JoinedElement(Collections.singletonList(r))));
        }

        JoinResults res = joinTwoTables(tablesForJoining.get(0), tablesForJoining.get(1));

        for (int i = 2; i < tablesForJoining.size(); i++) {
            res = joinTwoTables(res, tablesForJoining.get(i));
        }

        return res;
    }

    private JoinResults joinTwoTables(Table<? extends TableElement> table1, Table<? extends TableElement> table2) {
        JoinResults res = new JoinResults();

        for (TableElement e1 : table1.getAll()) {
            for (TableElement e2 : table2.getAll()) {

                res.add(new JoinedElement(Arrays.asList(e1, e2)));
            }
        }

        return res;
    }
}

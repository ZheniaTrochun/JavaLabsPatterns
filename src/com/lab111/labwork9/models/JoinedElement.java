package com.lab111.labwork9.models;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Composite of TableElements
 */
public class JoinedElement implements TableElement {
    private List<TableElement> joinResultsRow;

    public JoinedElement(List<TableElement> joinResultsRow) {
        this.joinResultsRow = joinResultsRow;
    }

    public JoinedElement() {
        joinResultsRow = new ArrayList<>();
    }

    public boolean add(TableElement element) {
        return joinResultsRow.add(element);
    }

    @Override
    public String getFieldNames() {
        return joinResultsRow.stream()
                .map(r -> r.getFieldNames())
                .collect(Collectors.joining(", "));
    }
}

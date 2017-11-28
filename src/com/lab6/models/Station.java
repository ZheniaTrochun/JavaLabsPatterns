package com.lab6.models;

import com.lab6.visitors.NetworkElementVisitor;

import java.util.List;

/**
 * composite of NetworkElements
 */
public class Station implements NetworkElement {
    private int additionStaffPrice;
    private List<NetworkElement> elements;

    public Station(int additionStaffPrice, List<NetworkElement> elements) {
        this.additionStaffPrice = additionStaffPrice;
        this.elements = elements;
    }

    public int getAdditionStaffPrice() {
        return additionStaffPrice;
    }

    public void setAdditionStaffPrice(int additionStaffPrice) {
        this.additionStaffPrice = additionStaffPrice;
    }

    public List<NetworkElement> getElements() {
        return elements;
    }

    public void setElements(List<NetworkElement> elements) {
        this.elements = elements;
    }

    @Override
    public void accept(NetworkElementVisitor visitor) {
        elements.forEach(e -> e.accept(visitor));

        visitor.visit(this);
    }
}

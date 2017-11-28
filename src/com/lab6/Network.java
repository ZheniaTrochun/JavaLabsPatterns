package com.lab6;

import com.lab6.models.NetworkElement;
import com.lab6.visitors.NetworkEstimateCalculator;

import java.util.List;

public class Network {
    private List<NetworkElement> elements;

    public Network() {
    }

    public Network(List<NetworkElement> elements) {

        this.elements = elements;
    }

    public List<NetworkElement> getElements() {
        return elements;
    }

    public void setElements(List<NetworkElement> elements) {
        this.elements = elements;
    }

    public int getEstimate() {
        NetworkEstimateCalculator calculator = new NetworkEstimateCalculator();

        return calculator.getEstimate(elements);
    }
}

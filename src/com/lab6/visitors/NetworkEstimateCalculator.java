package com.lab6.visitors;

import com.lab6.models.Cable;
import com.lab6.models.NetworkElement;
import com.lab6.models.Server;
import com.lab6.models.Station;

import java.util.List;


/**
 * simple estimate calculator based on visitor pattern
 */
public class NetworkEstimateCalculator implements NetworkElementVisitor {
    private static final int METER_CABLE_PRICE = 20;
    private int estimate;

    public NetworkEstimateCalculator() {
        this.estimate = 0;
    }

    @Override
    public void visit(Cable cable) {
        System.out.println("Visited cable!");

        estimate += cable.getLength() * METER_CABLE_PRICE;
    }

    @Override
    public void visit(Server server) {
        System.out.println("Visited server!");

        estimate += server.getPrice();
    }

    @Override
    public void visit(Station station) {
        System.out.println("Visited station!");

        estimate += station.getAdditionStaffPrice();
    }

    public int getEstimate(NetworkElement network) {
        network.accept(this);

        return estimate;
    }

    public int getEstimate(List<NetworkElement> network) {
        for (NetworkElement element: network) {
            element.accept(this);
        }

        return estimate;
    }
}

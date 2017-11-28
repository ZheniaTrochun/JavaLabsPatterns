package com.lab6;

import com.lab6.models.Cable;
import com.lab6.models.Server;
import com.lab6.models.Station;
import com.lab6.visitors.NetworkEstimateCalculator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cable cable1 = new Cable(1);
        Cable cable2 = new Cable(2);
        Cable cable3 = new Cable(3);

        Server server1 = new Server(100000);
        Server server2 = new Server(200000);
        Server server3 = new Server(150000);
        Server server4 = new Server(90000);


        Network network = new Network(Arrays.asList(cable1, cable2, cable3, server1, server2, server3, server4));

        System.out.println(network.getEstimate());
    }
}

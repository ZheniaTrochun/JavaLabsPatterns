package com.lab6.models;

import com.lab6.visitors.NetworkElementVisitor;

public class Server implements NetworkElement {
    private final int price;

    public Server(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(NetworkElementVisitor visitor) {
        visitor.visit(this);
    }
}

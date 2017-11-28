package com.lab6.models;

import com.lab6.visitors.NetworkElementVisitor;

public class Cable implements NetworkElement {
    private int length;

    public Cable(int length) {
        this.length = length > 0 ? length : 0;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0)
            this.length = length;
    }

    @Override
    public void accept(NetworkElementVisitor visitor) {
        visitor.visit(this);
    }
}

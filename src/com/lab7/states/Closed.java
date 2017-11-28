package com.lab7.states;

import com.lab7.TcpConnection;

public class Closed implements TcpState {
    @Override
    public byte[] receiveData(TcpConnection connection) {
        throw new IllegalStateException();
    }

    @Override
    public void sendData(TcpConnection connection, byte[] data) {
        throw new IllegalStateException();
    }

    // todo think about this
    @Override
    public void connect(TcpConnection connection) {
        System.out.println("Called \"connect\" on state CLOSED");

        connection.setState(new Established());
    }

    @Override
    public void disconnect(TcpConnection connection) {
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "Closed";
    }
}

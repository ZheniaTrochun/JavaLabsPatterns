package com.lab7.states;

import com.lab7.TcpConnection;

public class Listening implements TcpState {
    @Override
    public byte[] receiveData(TcpConnection connection) {
        throw new IllegalStateException();
    }

    @Override
    public void sendData(TcpConnection connection, byte[] data) {
        throw new IllegalStateException();
    }

    @Override
    public void connect(TcpConnection connection) {
        System.out.println("Called \"connect\" on LISTENING state");

        connection.setState(new Established());
    }

    @Override
    public void disconnect(TcpConnection connection) {
        System.out.println("Called \"disconnect\" on LISTENING state");

        connection.setState(new Closed());
    }

    @Override
    public String toString() {
        return "Listening";
    }
}

package com.lab7.states;

import com.lab7.TcpConnection;

public class Established implements TcpState {
    @Override
    public byte[] receiveData(TcpConnection connection) {
        System.out.println("Called \"receiveData\" on ESTABLISHED state");

        return new byte[0];
    }

    @Override
    public void sendData(TcpConnection connection, byte[] data) {
        System.out.println("Called \"sendData\" on ESTABLISHED state");
    }

    @Override
    public void connect(TcpConnection connection) {
        System.out.println("Called \"connect\" on ESTABLISHED state");
    }

    @Override
    public void disconnect(TcpConnection connection) {
        System.out.println("Called \"disconnect\" on ESTABLISHED state");

        connection.setState(new Closed());
    }

    @Override
    public String toString() {
        return "Established";
    }
}

package com.lab7;

public class Main {
    public static void main(String[] args) {
        TcpConnection connection = new TcpConnection();

        connection.connect();
        connection.sendData(new byte[0]);
        connection.receiveData();
        connection.disconnect();

        connection.connect();
    }
}

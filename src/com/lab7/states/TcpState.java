package com.lab7.states;

import com.lab7.TcpConnection;

public interface TcpState {

    /**
     * method-placeholder for receiving information
     *
     * @param connection tcp connection context
     * @return information
     */
    byte[] receiveData(TcpConnection connection);

    /**
     * method-placeholder for sending information
     *
     * @param connection tcp connection context
     * @param data information
     */
    void sendData(TcpConnection connection, byte[] data);

    /**
     * method-placeholder for establishing connection
     *
     * @param connection tcp connection context
     */
    void connect(TcpConnection connection);

    /**
     * method-placeholder for closing connection
     *
     * @param connection tcp connection context
     */
    void disconnect(TcpConnection connection);
}

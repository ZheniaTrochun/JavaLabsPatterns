package com.lab7;

import com.lab7.states.Listening;
import com.lab7.states.TcpState;


/**
 * TCP connection context
 */
public class TcpConnection {

    private TcpState state;


    public TcpConnection(TcpState state) {
        this.state = state;
    }

    public TcpConnection() {
        state = new Listening();
    }


    public TcpState getState() {

        return state;
    }

    public void setState(TcpState state) {
        this.state = state;
    }


    public void connect() {
        state.connect(this);
    }

    public void disconnect() {
        state.disconnect(this);
    }

    public void sendData(byte[] data) {
        state.sendData(this, data);
    }

    public byte[] receiveData() {
        return state.receiveData(this);
    }
}

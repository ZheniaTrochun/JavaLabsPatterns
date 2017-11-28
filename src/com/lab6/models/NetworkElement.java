package com.lab6.models;

import com.lab6.visitors.NetworkElementVisitor;

/**
 * simple element of network interface
 */
public interface NetworkElement {

    void accept(NetworkElementVisitor visitor);
}

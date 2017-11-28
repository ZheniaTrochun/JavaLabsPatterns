package com.lab6.visitors;

import com.lab6.models.Cable;
import com.lab6.models.Server;
import com.lab6.models.Station;

/**
 * visitor for NetworkElements pattern implementation interface
 */
public interface NetworkElementVisitor {

    void visit(Cable cable);

    void visit(Server server);

    void visit(Station station);
}


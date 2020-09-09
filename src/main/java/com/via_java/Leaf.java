package com.via_java;

import com.via_implicing_wiring.Address;
import org.springframework.beans.factory.annotation.Autowired;

public class Leaf {

    private Tree tree;

    private Ballable ballable;

    @Autowired
    private Address address;

    public Leaf(Tree tree) {
        this.tree = tree;
    }

    public Leaf(Tree tree, Ballable ballable) {
        this.tree = tree;
        this.ballable = ballable;
    }

    public Ballable getBallable() {
        return ballable;
    }

    public Tree getTree() {
        return tree;
    }

    public Address getAddress() {
        return address;
    }
}

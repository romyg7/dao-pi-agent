package org.daopi.agent;

import jade.core.Agent;

public class DaoPiAgent extends Agent {

    @Override
    protected void setup() {
        System.out.println("DAO-PI Agent started: " + getAID().getName());
    }

    @Override
    protected void takeDown() {
        System.out.println("DAO-PI Agent stopped: " + getAID().getName());
    }
}

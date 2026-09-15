package org.daopi.agent;

public class HelloWorldAgent extends DaoPiAgent {

    @Override
    protected void setup() {
        super.setup();

        System.out.println("Hello, DAO-PI!");
   }
}

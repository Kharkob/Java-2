package com.java2;

public class App {
    public static void main(String[] args) {
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();

        // Testing AsteriskLogger
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");

        // Testing SpacedLogger
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
package org.example.sandbox.inheritance;

public class Truck extends Vehicle{

    public Truck() {
        counter++;
    }

    @Override
    public void load() {
        System.out.println("Loading truck stuff...");
    }

    @Override
    public void transport() {
        System.out.println("Transporting truck stuff...");
    }

    @Override
    public void move() {
        System.out.println("Moving truck stuff...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping truck.");
    }

    @Override
    public void turnLeft() {
        System.out.println("Turning truck left.");
    }

    @Override
    public void turnRight() {
        System.out.println("Turning truck right.");
    }

    @Override
    public void unload() {
        System.out.println("Unloading Truck...");
    }
}

package org.example.sandbox.inheritance;

public abstract class Vehicle implements Conveyance{

    public static int counter;
    protected int loadCapacity;

    protected Vehicle() {
        counter++;
    }
    public static int getCounter() {
        return counter;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public abstract void load();

}

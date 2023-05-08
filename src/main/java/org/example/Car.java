package org.example;
@FunctionalInterface
public interface Car {
    int speed=10;
    void go();
    default void stop(){
        System.out.println("Car stopped");
    }
    static void printspeed(){
        System.out.println("Car speed is "+speed);
    }
}

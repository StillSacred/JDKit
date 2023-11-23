package org.example;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParadoxSimulationNoChange(10_000_000));
        Thread thread2 = new Thread(new ParadoxSimulationWithChange(10_000_000));
        thread1.start();
        thread2.start();
    }
}
package com.example;

public class Main {
    public static void main(String[] args) {
        Cestino c1 = new Cestino(0);
        Deposito d1 = new Deposito(c1, 10000);
        Deposito d2 = new Deposito(c1, 10000);
        d1.start();
        d2.start();
        try {
            d1.join();
            d2.join();
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("conto finale:"+c1.getValore());
    }
}
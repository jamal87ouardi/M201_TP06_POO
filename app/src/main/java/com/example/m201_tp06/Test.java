package com.example.m201_tp06;

public class Test {

    public static void main(String[] args) {
        Patient p1 = new Patient(75.5,1.78);
        System.out.println(p1);
        System.out.println(p1.calculerIMC());
    }
}

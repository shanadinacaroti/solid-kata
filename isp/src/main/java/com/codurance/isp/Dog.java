package com.codurance.isp;

public class Dog implements Animal, iDog {
//    @Override
//    public void fly() {
//
//    }

    @Override
    public void run() {
        System.out.print("Dog is running");
    }
//
//    @Override
//    public void bark() {
//        System.out.print("Dog is barking");
//    }


    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}

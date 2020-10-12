package com.codurance.isp;

public class Bird implements Animal, iBird{
//    public void bark() { }
//    public void run() {
//        System.out.print("Bird is running");
//    }
//    public void fly() {
//        System.out.print("Bird is flying");
//    }


    @Override
    public void run() {
        System.out.println("Bird is running");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
package com.codurance.isp;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Dog dog = new Dog();

        bird.fly();
        bird.run();

        dog.bark();
        dog.run();
    }
}

package com.company;

public class Subtraction extends Operation {
    @Override
    public void execute(double a, double b) {
        if ((a - b) % 1 == 0) {
            System.out.println("Результат: " + Math.round(a - b));
        } else {
            System.out.println("Результат: " + (a - b));
        }
    }
}
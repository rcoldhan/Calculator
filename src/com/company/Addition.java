package com.company;

public class Addition extends Operation {
    @Override
    public void execute(double a, double b) {
        if (a % 1 == 0 && b % 1 == 0) {
            System.out.println("Результат: " + (int) (a + b));
        } else {
            System.out.println("Результат: " + (a + b));
        }
    }
}
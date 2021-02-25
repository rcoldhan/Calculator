package com.company;

public class Division extends Operation {
    @Override
    public void execute(double a, double b) {
        if (b == 0) {
            System.out.println("Делитель не может равняться нулю! Попробуй еще раз..");
            return;
        }
        if (a % b == 0) {
            System.out.println("Результат: " + Math.round(a / b));
        } else {
            System.out.println("Результат: " + (a / b));
        }
    }
}
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication multi = new Multiplication();
        Division div = new Division();

        while (true) {
            System.out.println("Введи текст в формате 'a (операция) b' и нажми Enter");
            System.out.println("Для завершения программы введи 'exit'");
            double a = console.nextDouble();
            char op = console.next().charAt(0);
            double b = console.nextDouble();

            if (op == '+') {
                add.execute(a, b);
            }
            else if (op == '-') {
                sub.execute(a, b);
            }
            else if (op == '*') {
                multi.execute(a, b);
            }
            else if (op == '/') {
                div.execute(a, b);
            }
        }
    }
}

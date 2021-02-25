package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * На вход ожидаю строку формата a(операция)b.
 * При вводе числа double в качестве разделителя ожидаю точку.
 * Программа завершается при вводе exit.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Multiplication multi = new Multiplication();
        Division div = new Division();

        System.out.println("Введи текст в формате 'a(операция)b' и нажми Enter");
        System.out.println("Для завершения программы введи 'exit'");
        double a, b;
        String operation;

        while (true) {
            String str = console.nextLine();
            if (str.equals("exit")) {
                return;
            }
            String regex = "^\\s*(-?\\d+(\\.\\d+)?)\\s*([*+/-])\\s*(-?\\d+(\\.\\d+)?)\\s*$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);

            if (matcher.find()) {
                a = Double.parseDouble(matcher.group(1));
                operation = matcher.group(3);
                b = Double.parseDouble(matcher.group(4));

                switch (operation) {
                    case "+":
                        add.execute(a, b);
                        break;
                    case "-":
                        sub.execute(a, b);
                        break;
                    case "*":
                        multi.execute(a, b);
                        break;
                    case "/":
                        div.execute(a, b);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Неверный ввод!");
            }
        }
    }
}
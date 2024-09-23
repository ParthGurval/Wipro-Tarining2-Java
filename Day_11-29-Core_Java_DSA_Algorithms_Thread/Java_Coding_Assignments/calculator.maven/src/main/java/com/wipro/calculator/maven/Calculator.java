package com.wipro.calculator.maven;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter first number:");
        int a = scanner.nextInt();

        System.out.println("Enter second number:");
        int b = scanner.nextInt();

        System.out.println("Choose an operation: add, sub, mul, div");
        String operation = scanner.next();

        try {
            switch (operation) {
                case "add":
                    System.out.println("Result: " + calc.add(a, b));
                    break;
                case "sub":
                    System.out.println("Result: " + calc.sub(a, b));
                    break;
                case "mul":
                    System.out.println("Result: " + calc.mul(a, b));
                    break;
                case "div":
                    System.out.println("Result: " + calc.div(a, b));
                    break;
                default:
                    System.out.println("Invalid operation.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

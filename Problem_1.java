package com.screeningtest;
import java.util.Scanner;

//Problem-1.java
// Author: Ganga Raju Huddar
// Language: Java
// Description: A simple calculator that performs basic arithmetic operations.

class Problem_1 {
	double a, b;
	String operation;

	Problem_1(double a, double b, String operation) {
		this.a = a;
		this.b = b;
		this.operation = operation;
	}

	void performOperation() {
        switch (operation.toLowerCase()) {
            case "add":
                System.out.println("Result: " + (a + b));
                break;
            case "subtract":
                System.out.println("Result: " + (a - b));
                break;
            case "multiply":
                System.out.println("Result: " + (a * b));
                break;
            case "divide":
                if (b != 0)
                    System.out.println("Result: " + (a / b));
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid operation type!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add/subtract/multiply/divide): ");
        String op = sc.next();
        Problem_1 calc = new Problem_1(a, b, op);
        calc.performOperation();
        sc.close();
    }
}

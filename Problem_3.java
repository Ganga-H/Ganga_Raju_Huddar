package com.screeningtest;
//Problem-3.java
// Author: Ganga Raju Huddar
// Language: Java
// Description: Generates a variable odd-number series based on input conditions.
import java.util.Scanner;

public class Problem_3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0)
            limit = a - 1;  // for even numbers, take previous odd count
        else
            limit = a;      // for odd numbers, take same number

        System.out.print("Output: ");
        for (int i = 1, count = 1; count <= limit; i += 2, count++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

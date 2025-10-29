package com.screeningtest;
import java.util.Scanner;
//Problem-2.java
// Author: Ganga Raju Huddar
// Language: Java
// Description: Generates a series of odd numbers up to 'a' terms.


public class Problem_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Output: ");
        for (int i = 1; i <= a * 2 - 1; i += 2) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}

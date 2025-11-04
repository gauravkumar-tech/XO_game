package com.gaurav.anshul;

import java.util.Scanner;

public class AddNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum of two numbers " + sum);
    }
}

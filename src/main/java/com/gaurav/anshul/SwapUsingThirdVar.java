package com.gaurav.anshul;

import java.util.Scanner;

public class SwapUsingThirdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped Numbers using third variable " + a + " ," + b);

    }
}

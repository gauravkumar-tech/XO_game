package com.practice.anshul;

import java.util.Scanner;

public class SwapNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to be swapped ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int swapNum = a + b;
        a = swapNum - a;
        b = swapNum - b;
        System.out.println("Swapped Number " + a + " ," + b);

    }
}

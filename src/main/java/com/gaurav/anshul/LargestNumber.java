package com.gaurav.anshul;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b)
            System.out.println( a + " is Larger Number ");
        else
            System.out.println( b + " is Larger Number");
    }
}

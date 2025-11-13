package com.practice.anshul;

import java.util.Scanner;

public class AnshulXOGame {
    public static void main(String[] args) {
        //here
       Scanner sc = new Scanner(System.in);
       char player = 'X';
       char[][] board = new char[3][3];
        for (int i = 1; i<3; i++){
            for (int j =1; j<3; j++){
               board[i][j] = '-';
            }
        }



    }
}

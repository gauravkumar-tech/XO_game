package com.gaurav.game;

import java.util.Scanner;

public class XoGame {
    public static void main(String[]args){

        String [][] arr = new String [3][3];
        System.out.println("Printing game.. ready.");
        String player1 = "O";
        String player2 = "X";
        boolean player1Or2 = true;

        int valueUpdated = 0;

        Scanner sc = new Scanner(System.in);

        printArr(arr);

        while(valueUpdated < 9){
            System.out.println("enter the row then press enter then column and enter.");
            if(player1Or2 == true){
                System.out.println("player 1 : 'O' turn : Enter row (number should be between 0-2)");
                int row = sc.nextInt();
                System.out.println("player 1 : 'O' turn : Enter Column (number should be between 0-2)");
                int column = sc.nextInt();

                arr[row][column] = player1;
                valueUpdated ++;
                player1Or2 = false;
                printArr(arr);
            }else{
                System.out.println("player 2 : 'X' turn : Enter row (number should be between 0-2)");
                int row = sc.nextInt();
                System.out.println("player 2 : 'X' turn : Enter Column (number should be between 0-2)");
                int column = sc.nextInt();

                arr[row][column] = player2;
                valueUpdated ++;
                player1Or2 = true;
                printArr(arr);
            }
        }

        System.out.println("game over thanks for playing. final value are : --");
        printArr(arr);


    }


    public static void printArr(String [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(j < arr.length -1)
                    System.out.print(arr[i][j] + " | ");
                else
                    System.out.println(arr[i][j]);
            }
            System.out.println("------------------");
        }
    }
}

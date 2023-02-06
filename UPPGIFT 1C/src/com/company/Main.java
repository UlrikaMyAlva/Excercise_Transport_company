package com.company;

import java.util.Scanner;

public class Main {

    /*
        FIG. UPPGIFT 1C

        AUTHOR
        Ulrika Eriksson, 2022-04-14

        INTRODUCTION
        A program that graphically shows how a transport company will place the money on the floor of their vehicles
        in rows and columns.

        IMPLEMENTATION
        First I needed to solve how I got the rows and columns separated. I decided to use a for-loop, and inside that
        a nested for-loop. I used print (instead of println) to get them on the same row, and in the end of the first
        for-loop I put in a println with only a space (" ") to make a new row for the next loop.

        DISCUSSION
        I didn't know about the print function (only println) så first I didn't manage to resolve the task with two
        for-loops without separating the rows and the columns. I decided to make an arraylist, and adding X to it in a
        loop and then afterwords printing the list. But that didn't solve the exercise the way it was intended to. Later
        I read in the book about the System.out.print() and realised I could use that.

        I still didn't manage to print it correct. This was the first output:

        X
        XXXXX
        XXXXX
        XXXX

        I tried to put a println i the end of the first loop and that worked. I also had to use -1 on the
        nested loop for columns, otherwise I would get one X too much.

        I would like to solve this task without using a println(" ") in the end of the first loop to make the code smaller.

        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Asking for input
        System.out.println("How many rows? ");
        int rows = scan.nextInt();

        System.out.println("How many columns? ");
        int columns = scan.nextInt();


        //Print one X for every row in the first for-loop, then print amount of X for every X in column
        for (int k = 1; k <= rows; k++ ){
            System.out.print("X");
            //Print -1 amount of X
            for (int l = 0; l < columns - 1; l++) {
                System.out.print("X");
            }
            //Print one empty println for each row, to make a new row
            System.out.println(" ");
        }
    }
}



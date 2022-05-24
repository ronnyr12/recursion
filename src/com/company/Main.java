package com.company;

public class Main {

    public static void main(String[] args) {
        printRowStars(6);
    }

    public static void printRowStars(int m){
        if(m<=1)
            System.out.println("*");
        else{
            printRowStars(m-1);
            printStars(m);
            System.out.println();
        }
    }
    public static void printStars(int n){
        if(n<=1)
            System.out.print("*");
        else {
            printStars(n - 1);
            System.out.print("*");
        }
    }
}

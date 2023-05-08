package org.example;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int getLength(){
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        return length;
    }
    static int getWidth(){
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        scanner.close();
        return width;
    }
    static void drawRectangle(){
        int length = getLength();
        int width = getWidth();
        for (int i = 0; i < length; i++) {
            if(i==0||i==length-1){
                System.out.print(" ");
            }else{
              System.out.print("|");}
            for (int j = 0; j < width-1; j++) {
               if (j ==width-2) {
                   if (i ==0||i==length-1){
                       System.out.print(" ");
                   }else{
                    System.out.print("|");}
                }else if (i ==0||i==length-1){
                    System.out.print("-");
                }else {
                    System.out.print(" ");
                }
                }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       drawRectangle();
    }
}
package org.example;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static void drawRectangle(int length, int width){
        for (int i = 0; i < length; i++) {
            if(i==0||i==length-1){
                System.out.print(" ");
            }else{
              System.out.print("|");}
                drawLine(length,width, i);
            System.out.println();
        }
        scanner.close();
    }
    static void drawLine(int length,int width,int i){
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
    }
    public static void main(String[] args) {
        System.out.println("Введите длину и ширину прямоугольника");
       drawRectangle(scanner.nextInt(), scanner.nextInt());
    }
}
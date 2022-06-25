package com.company;
import java.util.Scanner;

public class CHW_06_Percentage {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :1");
        float marksf = sc.nextFloat();
        System.out.println("Enter Marks :2");
        float marks1f = sc.nextFloat();
        System.out.println("Enter Marks :3");
        float marks2f = sc.nextFloat();
        System.out.println("Enter Marks :4");
        float marks3f = sc.nextFloat();
        System.out.printf("Enter Marks :5");
        float marks4f = sc.nextFloat();
        float sumf = (marksf + marks1f + marks2f + marks3f + marks4f) / 5;
        System.out.println("Total Percent : "+sumf +"%");
    }
}

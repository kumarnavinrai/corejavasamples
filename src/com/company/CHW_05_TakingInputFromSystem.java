package com.company;
import java.util.Scanner;

public class CHW_05_TakingInputFromSystem {
    public static void main(String[] args) {
        System.out.println("Taking inout from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number one:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is:");
        System.out.println(sum);
    }
}

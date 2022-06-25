package com.company;

public class cwh_21_ch5_loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using Loops:");
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }

        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);

        for (i=7; i!=0; i--){

            System.out.println(i);

        }

        //using for loop
        for(i=10;i>0;i--){
            if(i==7){
                break;   //break the loop
            }
            System.out.println(i);
        }
    }
}

package com.company;

class Employeetwo {
    // First constructor
    Employeetwo(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
    //    Constructor overloaded
    Employeetwo(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}

public class CWH_constructors {

    public static void main(String[] args) {
        Employeetwo shubham = new Employeetwo("Shubham",1);
        Employeetwo harry = new Employeetwo("Harry",2,70000);



    }

}

package com.Compare;

public class B extends A {
    public static void main(String[] args) {

        if(line1 > line2){
            System.out.println("line1" + " is greater than " + "line2");
        }
        else if(line1 < line2){
            System.out.println("line1" + " is less than " + "line2");
        }
        else{
            System.out.println("line1" + " is equal to " + "line2");
        }
    }
}
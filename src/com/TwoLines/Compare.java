package com.TwoLines;

public class Compare extends TwoLines {

    public static void main(String[] args) {
        if ((a1 / a2 == b1 / b2)
                && (a1 / a2 == c1 / c2)
                && (b1 / b2 == c1 / c2))
            System.out.println( "The given straight"
                    +" lines are equal");

        else
            System.out.println("The given straight"
                    + " lines are not equal");
    }
    }

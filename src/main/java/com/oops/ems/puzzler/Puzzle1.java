package com.oops.ems.puzzler;

public class Puzzle1 {

    {
        System.out.println("Inside non static block");
    }

    static {
        System.out.println("Inside static block");
    }

    public Puzzle1() {
        System.out.println("Inside constructor block");
    }

    public static void main(String args[]) {

        Puzzle1 puzzle1 = new Puzzle1();
        System.out.println("Inside main method");

    }
}

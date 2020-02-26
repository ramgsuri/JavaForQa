package com.oops.ems.puzzler;

import com.oops.ems.exception.NoVacancyException;

public class Puzzle2 {

    public static void main(String args[]) {

        Boolean myVal = funReturn();
        System.out.println("value is" + myVal);
    }

    static Boolean funReturn() {

        try {
            throw new NoVacancyException(" vacancy full ");
        } catch (NoVacancyException exp) {
            return true;
        } finally {
            return false;
        }
    }
}

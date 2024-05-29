package org.math;

import static java.lang.Math.*;

/*
 *  This in an "all-static" class, i.e., one with nothing but static methods.
 */

class Calculator {

    /*
     *  Returns the average of the supplied integers.
     */
    public static double average(int first, int... rest) {   //  3, 5, 10, 13
        double result = 0.0;

        int sum = first;
        for (int value : rest) {
            sum += value;   //  sum = sum + value
        }

        result = (1.0 * sum) / (rest.length + 1);

        return result;
    }

    // add a + b
    public static double add(double a, double b) {
        return a + b;
    }

    // subtract a + b
    public static double subtract(double a, double b) {
        return a - b;
    }

    /*
     * Indicates if the supplied integer is even or not.
     */
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     *  Returns a random integer between 'min' and 'max' (inclusive)
     *
     * TIP: think it thru using actual numbers, e.g., min=5 and max=20.
     */

    public static int randomInt(int min, int max){
        int result = 0;

        double rand = Math.random();                        //  0.0000  to  0.9999
        double scaled = (rand * (max - min + 1)) + min;     //  5.0000  to 20.9999
        result = (int) scaled;

        return result;
    }

    /*
     *  Convenience method to return a random integer between 1 and 'max'.
     */
    public static int randomInt(int max){
        return randomInt(1, max);
    }

    /*
     *  Returns a random integer between 1 and 16
     */
    public static int randomInt() {
        return randomInt(1, 16);    // calls the top statement above me

    }
}
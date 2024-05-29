/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>\n" +
                           "Example: java TelevisionClientArgs Samsung 32 PLASMA\n" +
                           "Note:\n" +
                           "Supported brands are " + Arrays.toString(Television.VALID_BRANDS) + "\n" +
                           "Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME + "\n" +
                           "Supported displays are " + Arrays.toString(DisplayType.values());
            System.out.println(usage);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
//        System.out.println("You provided " + args.length + " arguments");

        //  STEP 1: convert from string into proper types, as necessary
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        //  STEP 2: create the Television object from these 3 values
        Television tv = new Television(brand, volume, display);

        //  STEP 3: congratulate them on their order, print the resulting Television
        System.out.println("Thank you for your purchase");
        System.out.println("Your television is on the way:");
        System.out.println(tv);




    }
}
package mil.ticket.test;

import mil.ticket.AirCraft;
import mil.ticket.Purpose;

/*
 * This is a Validation page
 */
class AirCraftValidationTest {
    public static void main(String[] args) {

        AirCraft ac1 = new AirCraft("F16", 10000, Purpose.AIR_TO_AIR);
        System.out.println(ac1);

    }

}
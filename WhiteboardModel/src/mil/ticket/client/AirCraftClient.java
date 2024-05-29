package mil.ticket.client;

import mil.ticket.AirCraft;
import mil.ticket.Purpose;

/*
 * Client-side "main-class" (class definition with the main() method)
 * It will create a few instances of AirCraft, and give them a basic test-drive.
 */
class AirCraftClient {

    public static void main(String[] args) {
        //  create an AirCraft object and set its properties
        AirCraft ac1 = new AirCraft();
        ac1.setName("SR-71");
        ac1.setMunitionsOnBoard(100000);
        ac1.setPurpose(Purpose.RECONNAISSANCE);

        //  create a second AirCraft object and set its properties
        AirCraft ac2 = new AirCraft("Typhoon", Purpose.AIR_TO_AIR);
        //  ac2.setMunitionsOnBoard(250);

        //  create a third AirCraft object and set its properties
        AirCraft ac3 = new AirCraft("SU-34", 0, Purpose.BOMBER);

        //  call some business methods on the AirCraft
//        ac1.powerUp();
//        ac1.takeOff();
//        ac1.landing();
//        ac1.powerDown();
//
//        ac2.powerUp();
//        ac2.takeOff();
//        ac2.landing();
//        ac2.powerDown();
//
//        ac3.powerUp();
//        ac3.takeOff();
//        ac3.landing();
//        ac3.powerDown();

        //  print the results (toString() is automatically called)
        System.out.println(ac1);
        System.out.println(ac2);
        System.out.println(ac3);
    }

}
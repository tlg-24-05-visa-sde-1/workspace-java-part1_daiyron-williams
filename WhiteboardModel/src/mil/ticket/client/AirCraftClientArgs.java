package mil.ticket.client;

import mil.ticket.AirCraft;
import mil.ticket.Purpose;
import java.util.Arrays;

class AirCraftClientArgs {

    public static void main(String[] args) {
        //  must first check for arguments - just putting this code from the lab for information purposes only
        if (args.length < 3) {
            String usage = "Use: AirCraftClientArgs <name> <munitions> <purpose>\n" +
                           "Example: AirCraftClientArgs Typhoon 250 AIR_TO_AIR" +
                           "Note:\n" +
                           "Supported names are " + Arrays.toString(AirCraft.VALID_NAMES) + "\n" +
                           "MunitionsOnBoard must be " + AirCraft.MIN_MUNITIONSONBOARD + " to " +
                            AirCraft.MAX_MUNITIONSONBOARD + "\n" +
                           "Supported purposes are " + Arrays.toString(Purpose.values());
            System.out.println(usage);
            return; //  early return from main(), application exits
        }

        //  can proceed because of arguments

        //  convert string into proper types as necessary
        String name = args[0];
        int munitions = Integer.parseInt(args[1]);
        Purpose purpose = Purpose.valueOf(args[2]);

        //  create new aircraft object from 3 vales
        AirCraft airCraft = new AirCraft(name, munitions, purpose);

        //  print results
        System.out.println(airCraft);



    }

}
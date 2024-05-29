package mil.ticket;

import java.util.Arrays;

/*
 * Class to model the styles or purposes of FighterAirCraft
 * It has NO main() method - classes like these don't
 */
public class AirCraft {
    //  class ("static") variables - one copy, stored in the class-wide common shared area.
    public static final int MIN_MUNITIONSONBOARD = 0;
    public static final int MAX_MUNITIONSONBOARD = 1000;
    public static final String[] VALID_NAMES = { "SR-71", "Typhoon", "SU-34"};  // I did this for practice, I know enum is the correct way

    //  properties or attributes of aircraft
    private String name; // constraint: [SR-71, Typhoon, Su-34]
    private Integer munitionsOnBoard; // constraint: [0 - 1000 pounds], will return "null" if amount is not input
    private Purpose purpose; // constraint: [Air-to-Air, Bomber, Reconnaissance]

    //  constructors - these get called when clients say "new"
    public AirCraft(){
        //  no-op
    }

    public AirCraft(String name){
        setName(name);
    }

    public AirCraft(String name, Purpose purpose){
        this(name);
        setPurpose(purpose);
    }

    public AirCraft(String name, Integer munitionsOnBoard, Purpose purpose){
        this(name, purpose);
        setMunitionsOnBoard(munitionsOnBoard);
    }

    //  functions or behaviors - "methods" in Java
    public void powerUp(){
        System.out.println("AirCraft " + getName() + " is powering up with "
                + getMunitionsOnBoard() + "lbs of munitions onboard.");
    }

    public void takeOff(){
        System.out.println(getName() + " is taking off for a " + getPurpose() + " mission.");
    }

    public void landing(){
        System.out.println(getName() + " is landing with " +  getMunitionsOnBoard() + "lbs of munitions onboard.");
    }

    public void powerDown(){
        System.out.println(getName() + " is powering off after its " + getPurpose() + " mission");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidName(name)) {
            this.name = name;
        }
//        valid way but is like magic numbers
//            (name.equals("SR-71")   ||
//            name.equals("Typhoon") ||
//            name.equals("SU-34")) {

        else{
            String names = Arrays.toString(VALID_NAMES);
            System.out.println("Invalid name: " + name + ", Name must be SR-71, Typhoon or SU-34.");
        }
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public Integer getMunitionsOnBoard() {
        return munitionsOnBoard;
    }

    public void setMunitionsOnBoard(Integer munitionsOnBoard) {
        if (munitionsOnBoard >= MIN_MUNITIONSONBOARD && munitionsOnBoard <= MAX_MUNITIONSONBOARD){      //  valid - assign to field
            this.munitionsOnBoard = munitionsOnBoard;
        }
        else{
            System.out.println("Invalid munitions onboard: " + munitionsOnBoard + ". Munitions must be between " +
                    MIN_MUNITIONSONBOARD + " and " + MAX_MUNITIONSONBOARD);
        }
    }

    private static boolean isValidName(String name) {
        boolean isValid = false;
        for (String validName : VALID_NAMES) {
            if (validName.equalsIgnoreCase(name)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    /*
     *  Returns a string representation of this AirCraft object
     *  Generally includes the name of the class (its type) and the value of its fields.
     */

    public String toString() {
        return "AirCraft: " + "name = " + getName() + ", purpose = " + getPurpose() +
                ", munitions onboard = " + getMunitionsOnBoard();
    }
}
package com.entertainment;

import java.util.Arrays;

/*
 * Application class to model the working of a television set.
 * NO main() method here.
 */
public class Television {
    //  class ("static") variables - one copy, stored in the class-wide common shared area.
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    //          "Samsung", "LG", "Sony", "Toshiba"
    private static boolean isValidBrand(String brand) {
        boolean isValid = false;
        for (String validBrand : VALID_BRANDS) {
            if (validBrand.equalsIgnoreCase(brand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    // properties or attributes - called "instance variables" or "fields"
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;

    //  muting
    private boolean isMuted;
    private int oldVolume;

    //  constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();             //  delegate to no-arg ctor for the increment
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // business methods - these perform business functions
    public void turnOn() {
        // call private method for this task
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) {                   //  not currently muted
            this.oldVolume = getVolume();   //  store current volume in "oldVolume"
            setVolume(MIN_VOLUME);          //  set volume to "MIN_VOLUME"
            isMuted = true;                 //  set mute flag to true
        } else {                              //  currently muted
            setVolume(oldVolume);           //  restore volume from "oldVolume"
            isMuted = false;                //  set muted flag to false
        }
    }

    // accessor methods - these provide "controlled access" to the object's fields

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (isValidBrand(brand)) { // this will have the isValidBrand i'm pretty sure
            this.brand = brand;
        }
//        this could work, but its like magic numbers
//        (brand.equals("Samsung") ||
//            brand.equals("Sony") ||
//            brand.equals("LG") ||
//            brand.equals("Toshiba")) {
//            this.brand = brand;
//        }
        else {
            String brands = Arrays.toString(VALID_BRANDS);     //  I think Arrays.toString???
            System.out.println("Invalid brand: " + brand + ", Must be Samsung, Sony, LG, or Toshiba.");
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {         //  valid - assign to field
            this.volume = volume;
            isMuted = false;    //  clear the 'isMuted' flag, in case we were muted.
        } else {                                                       //  error message!
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);

//            System.out.println("Invalid volume: " + volume + ". Must be between " +
//                    MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;    // fake implementation
    }

    /*
     *  Returns a string representation of this Television object
     *  Generally includes the name of the class (its type) and the value of its fields.
     */

    public String toString() {
        String volumeString = isMuted() ? "<Muted>" : String.valueOf(getVolume());

        return String.format("Television: brand = %s, volume = %s, display = %s",
                getBrand(), volumeString, getDisplay());

//        return "Television: " + "brand = " + getBrand()  + ", volume = " + volumeString +
//                ", display = " + getDisplay();
    }
}
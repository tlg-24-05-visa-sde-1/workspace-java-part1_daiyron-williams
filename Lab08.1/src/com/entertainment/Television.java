package com.entertainment;

import java.util.Arrays;

/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
public class Television {

  // CLASS ("STATIC") VARIABLES/METHODS - one copy, stored in the class-wide common shared area
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

  private static int instanceCount = 0;

  public static int getInstanceCount() {
    return instanceCount;
  }

  private static boolean isValidBrand(String brand) {
    for (String validBrand : VALID_BRANDS) {
      if (validBrand.equalsIgnoreCase(brand)) {
        return true;
      }
    }
    return false;
  }

  // FIELDS OR INSTANCE VARIABLES
  private String brand = "LG";
  private int volume;
  private DisplayType display = DisplayType.LED;
  private boolean isMuted; // for muting behavior
  private int oldVolume; // for muting behavior

  // Television HAS-A Tuner (for all tasks related to channel-changing)
  private final Tuner tuner = new Tuner(); // instantiated internally, NOT exposed

  // CONSTRUCTORS
  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand); // delegate to brand ctor above me for handling brand
    setVolume(volume); // handle volume myself by delegating directly to its setter
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume); // delegate to brand-volume ctor
    setDisplay(display); // delegate to setter
  }

  // BUSINESS METHODS
  public void changeChannel(String channel) {
    // delegate to tuner object for the actual work
    tuner.setChannel(channel);
  }

  public String getCurrentChannel() {
    // delegate to the tuner object for the actual work
    return tuner.getChannel();
  }

  public void turnOn() {
    // call private method for this task
    boolean isConnected = verifyInternetConnection();
    System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
  }

  public void turnOff() {
    System.out.println("Shutting down... goodbye");
  }

  public void mute() {
    if (!isMuted()) {
      oldVolume = getVolume();
      this.volume = MIN_VOLUME; // calling the setter means that it automatically unmutes
      isMuted = true;
    } else {
      volume = oldVolume;
      isMuted = false;
    }
  }

  // ACCESSOR METHODS

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if (isValidBrand(brand)) {
      this.brand = brand;
    } else {
      System.out.println(
          "Invalid brand: " + brand + "\nValid brands are: " + Arrays.toString(VALID_BRANDS));
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf(
          "\nInvalid volume: %s. \nMust be between %s and %s.\n", volume, MIN_VOLUME, MAX_VOLUME);

      //            System.out.println("\nInvalid volume: " + volume +
      //                               "\nMust select volume between " + MIN_VOLUME + " and " +
      // MAX_VOLUME);
    } else {
      if (isMuted()) {
        mute();
      }
      this.volume = volume;
    }
  }

  public boolean isMuted() {
    return isMuted;
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true; // fake implementation
  }

  public String toString() {

    String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

    return String.format(
        "\nTelevision Details"
            + "\n------------------"
            + "\nBrand: %s\nVolume: %s\nDisplay: %s\nCurrent Channel: %s",
        getBrand(), volumeString, getDisplay(), getCurrentChannel());
  }
}

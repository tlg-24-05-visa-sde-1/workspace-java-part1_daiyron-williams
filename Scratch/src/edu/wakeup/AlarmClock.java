package edu.wakeup;

/*
 * Class definition to model the workings of an alarm clock
 * This is sometimes called a "business" class, or "system" class, or "application" class.
 * It has NO main() method - classes like these don't
 */
class AlarmClock {
    //  class ("static") variables
    //  There is only one copy of these, they live up in that "shared" area, NOT in each object!
    public static final int MIN_INTERVAL = 1;
    public static final int MAX_INTERVAL = 20;

    // properties or attributes - called "fields" or "instance variables"
    private int snoozeInterval = 5;     // default value when the client doesn't specify (instead of zero)

    //  constructors - like "methods" that get called when clients say "new"
    public AlarmClock(){
        //  no-op
    }

    public AlarmClock(int snoozeInterval) {
        setSnoozeInterval(snoozeInterval);  //  delegate to setter for validation/conversion
    }

    // functions or behaviors - called "methods" in Java
    public void snooze() {
        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    // "accessor" methods - project "controlled access" to object's fields
    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    /*
     * Implement a business data constraint - must be between 1 and 20 (inclusive)
     */
    public void setSnoozeInterval(int snoozeInterval) {
        if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {  //  valid -> assign to field
            this.snoozeInterval = snoozeInterval;
        }
        else {                                                  //  invalid -> error message
            System.out.println("Invalid snooze interval: " + snoozeInterval +
                   ". It must be between " + MIN_INTERVAL + " and " + MAX_INTERVAL + ".");
        }
    }

    /*
     *  Returns a string representation of this AlarmClock object
     *  Generally includes the name of the class (its type) and the value of its fields.
     */
    public String toString() {
        return "AlarmClock: snoozeInterval = " + getSnoozeInterval();
    }
}
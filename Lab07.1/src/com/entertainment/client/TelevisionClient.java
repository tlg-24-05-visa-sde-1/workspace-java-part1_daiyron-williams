package com.entertainment.client;

import com.entertainment.Television;

/*
 * Main-class to create a few instances of Television and give them a test-drive.
 * If you see a brand with "null" and volume of "0", it means the client has not specified the brand and volume
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        // create a Television object and set its properties

        Television tv = new Television("Sony", 40);

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MIN_VOLUME);

        // create a second Television object and set its properties, also
        Television tv2 = new Television("LG", Television.MAX_VOLUME);   //  loud as it can go!!
        //  tv2.setBrand("LG");
        //  tv2.setVolume(48);

        // create a third Television object
        Television tv3 = new Television("Apple");


        // call some business methods on them, i.e., turn them "on" and "off"
//        tv1.turnOn();
//        tv2.turnOn();
//        tv3.turnOn();
//
//        tv1.turnOff();
//        tv2.turnOff();
//        tv3.turnOff();

        //  show their
        System.out.println(tv);
        System.out.println(tv1);        // toString() automatically called
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances");
    }
}
package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {

    public static void main(String[] args) {

        Television tv = new Television();
        tv.setVolume(0);        //  should stick
        System.out.println(tv); //  volume should be 0

        tv.setVolume(100);      //  should stick
        System.out.println(tv); //  volume should be 100

        tv.setBrand("Samsung"); //  should stick
        System.out.println(tv); //  should say Samsung

        tv.setBrand("LG");
        System.out.println(tv); //  should say LG

        tv.setBrand("Sony");
        System.out.println(tv); //  should say Sony

        tv.setBrand("Toshiba");
        System.out.println(tv); //  should say Toshiba

        tv.setBrand("INVALID");
        System.out.println(tv); //  error message

        tv.setVolume(-1);       //  error message, volume not set
        tv.setVolume(101);      //  error message, volume not set
        System.out.println(tv); //  should still have the volume at 100, from before


    }
}
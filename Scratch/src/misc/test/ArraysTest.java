package misc.test;

import java.util.Arrays;

class ArraysTest {
    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 26;
        ages[1] = 47;
        ages[2] = 28;
        ages[3] = 23;

        System.out.println(Arrays.toString(ages));   //  toString() automatically called

        //  iterate using the for-each loop
        for (int age : ages) {
            System.out.println("The age is " + age);
        }
        System.out.println();

        double[] sizes = { 10.5, 9, 7, 10 };
        System.out.println(Arrays.toString(sizes));

        boolean[] statuses = new boolean[4];
        System.out.println(Arrays.toString(statuses));
        System.out.println();

        String[] names = { "daiyron", "kami", "kira", "deaiszha" };
        System.out.println(Arrays.toString(names));

        //  iterate using old-style index loop
        for (int i = 0; i < names.length; i++) {
            System.out.println("The names are " + names[i]);
        }


    }

}
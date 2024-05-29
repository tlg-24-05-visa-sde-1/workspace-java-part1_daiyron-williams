package net.people;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Daiyron", LocalDate.of(1997, 6, 3));

        //  print: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());

        System.out.println(p1);     //  toString() automatically called
    }

}
package com.company.sixthCourse;

public class Main {

    public static void main(String[] args) {
        Dad Piter = new Dad("Piter", "Parker", "usa", 1965, true);
        Piter.passport();
        Son Jack = new Son("Jack", 2010, true);
        Jack.passport();
        Daughter Mariya = new Daughter("Mariya", "Potter", 1993, false);
        Mariya.passport();
        Mariya.getAge();
    }
}

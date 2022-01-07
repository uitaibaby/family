package com.company.sixthCourse;

public class Daughter extends Dad {
    private String husbandName;
    private int age = 28;

    public Daughter(String name, String husbandName, int year, boolean male) {
        super(secondName, citizenship);
        this.name = name;
        this.year = year;
        this.male = male;
        this.husbandName = husbandName;
    }

    public Daughter(String name, int year, boolean male) {
        super(secondName, citizenship);
        this.name = name;
        this.year = year;
        this.male = male;
    }

    @Override
    public void passport() {
        if (husbandName != null) {
            System.out.println(name + " ex" + secondName + " " + husbandName + " " + citizenship + " " + year + " " + male);
        } else {
            System.out.println(name + " " + secondName + " " + citizenship + " " + year + " " + male);
        }
    }

    public int getAge(){
        System.out.println(name + " age is " + age);
        return age;
    }
}

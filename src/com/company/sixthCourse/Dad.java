package com.company.sixthCourse;

public class Dad {
    String name;
    static String secondName, citizenship;
    int year;
    boolean male;

    public Dad (String name, String secondName, String citizenship, int year, boolean male){
        this.name = name;
        this.secondName = secondName;
        this.citizenship = citizenship;
        this.year = year;
        this.male = male;
    }

    public Dad(String secondName, String citizenship) {
        this.secondName = secondName;
        this.citizenship = citizenship;
    }

    public void passport(){
        System.out.println(name + " " + secondName + " " + citizenship + " " + year + " " + male);
    }
}

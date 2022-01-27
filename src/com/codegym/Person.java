package com.codegym;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String birthDay;
    private String homeTown;

    public Person(String name, String birthDay, String homeTown) {
        this.name = name;
        this.birthDay = birthDay;
        this.homeTown = homeTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Họ và tên: "+ this.name +", ngày sinh: "+this.birthDay+", quê quán: "+this.homeTown;
    }
}

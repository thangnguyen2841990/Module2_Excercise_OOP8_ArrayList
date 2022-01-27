package com.codegym;

import java.io.Serializable;

public class Pupil implements Serializable {
    private String className;
    private String course;
    private String semester;
    private Person person;

    public Pupil(String className, String course, String semester, Person person) {
        this.className = className;
        this.course = course;
        this.semester = semester;
        this.person = person;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return person.toString() + ", Lớp: " + this.className + ", Khóa: " + this.course + ", Học Kỳ: "+ this.semester;
    }
}

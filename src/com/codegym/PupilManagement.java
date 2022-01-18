package com.codegym;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PupilManagement {
    private ArrayList<Pupil> pupils = new ArrayList<>();

    public PupilManagement() {
    }

    public PupilManagement(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }

    public ArrayList<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(ArrayList<Pupil> pupils) {
        this.pupils = pupils;
    }

    public void addPupil(Pupil newPupil) {
        pupils.add(newPupil);
    }

    public void displayAllPupils() {
        for (int i = 0; i < pupils.size(); i++) {
            System.out.println((i + 1) + ". " + pupils.get(i));
        }
    }
    public void findPupilClass10A1(String className){
        for (int i = 0; i < pupils.size(); i++) {
            if (pupils.get(i).getClassName().equals(className)){
                System.out.println(pupils.get(i));
            }else {
                continue;
            }
        }
    }
    public static Date convertStrToDate(String birthDay){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        try{
             date = dateFormat.parse(birthDay);

        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
    public void findPupil1985(){
        for (int i = 0; i < pupils.size(); i++) {
        if (convertStrToDate(pupils.get(i).getPerson().getBirthDay()).getYear() == 85 &&
                pupils.get(i).getPerson().getHomeTown().equals("Thái Nguyên")){
            System.out.println(pupils.get(i));
        }
        }
    }
}

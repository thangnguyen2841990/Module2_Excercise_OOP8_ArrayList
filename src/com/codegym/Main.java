package com.codegym;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PupilManagement pupilManagement = new PupilManagement();
        int choice = -1;
        try {
            pupilManagement.readerFile("pupil.txt");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            menu();
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice > 5){
                System.out.println("Menu chỉ có từ 1 => 5");
            }
            if (choice == 5){
                break;
            }
            switch (choice){
                case 1 : {
                    System.out.println("----Hiển thị toàn bộ thông tin học sinh----");
                    pupilManagement.displayAllPupils();
                    break;
                }
                case 2 : {
                    System.out.println("----Nhập thông tin học sinh----");
                       Pupil newPupil = inputPupilInfo();
                        pupilManagement.addPupil(newPupil);
                        System.out.println("Đã thêm thành công!");
                    }
                    break;

                case 3 : {
                    System.out.println("----Hiển thị tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên----");
                    pupilManagement.findPupil1985();
                    break;
                }
                case 4 : {
                    System.out.println("----Hiển thị tất cả học sinh học lớp 10A1----");
                    pupilManagement.findPupilClass10A1("10A1");
                    break;
                }

            }
            try {
                pupilManagement.writerToFile(pupilManagement.getPupils(),"pupil.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static void menu(){
        System.out.println("----MENU QUẢN LÝ HỌC SINH----");
        System.out.println("1. Hiển thị toàn bộ thông tin học sinh.");
        System.out.println("2. Nhặp thông tin học sinh.");
        System.out.println("3. Hiển thị tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên.");
        System.out.println("4. Hiển thị tất cả những học sinh của lớp 10A1.");
        System.out.println("5. Thoát.");
    }
    public static Pupil inputPupilInfo(){
        Scanner inputPupil = new Scanner(System.in);
        System.out.println("Họ và tên: ");
        String name = inputPupil.nextLine();
        System.out.println("Sinh nhật: ");
        String birthDay = inputPupil.nextLine();
        System.out.println("Quê quán: ");
        String homeTown = inputPupil.nextLine();
        System.out.println("Lớp: ");
        String className = inputPupil.nextLine();
        System.out.println("Khóa: ");
        String course = inputPupil.nextLine();
        System.out.println("Học Kỳ: ");
        String semester = inputPupil.nextLine();
        return new Pupil(className,course,semester,new Person(name,birthDay,homeTown));
    }
}

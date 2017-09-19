package com.NTHa16020933;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {

    private static ArrayList<Student> students = new ArrayList<Student>();

    /////////////////// So sánh Group
    public Boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    ////////////////// Sắp xếp sinh viên theo Group
    public ArrayList<Student> sortGroup(ArrayList<Student> s) {
        ArrayList<Student> s2 = s;
        for (int i = 0; i < s2.size() - 1; i++)
            for (int j = i + 1; j < s2.size(); j++)
                if (s2.get(i).getGroup().compareTo(s2.get(j).getGroup()) > 0) {
                    Student t = new Student();
                    t = s2.get(i);
                    s2.set(i, s2.get(j));
                    s2.set(j, t);
                }
        return s2;

    }

    ///////////////// In Sinh viên theo Group
    public void studentByGroup() {
        if (!students.isEmpty()) {
            ArrayList<Student> s = sortGroup(students);
            System.out.println("\n****** " + s.get(0).getGroup() + " ******");
            s.get(0).getInfo();
            for (int i = 1; i < s.size(); i++) {
                if (s.get(i).getGroup() != s.get(i - 1).getGroup())
                    System.out.println("\n******* " + s.get(i).getGroup() + " ******");
                s.get(i).getInfo();
            }
        }

    }

    ///////////////// Xóa sinh viên theo ID:
    public boolean removeStudent(String id) {
        int i = 0;
        while (i < students.size()) {
            if (students.get(i).getId().equals(id))
                break;
            i++;
        }
        if (i == students.size()) {
            System.out.println("Ko tim thay ID " + id);
            return false;
        } else {
            students.remove(i);
            System.out.println("Xoa thanh cong!");
        }
        return true;
    }

    /////////////////////// Thủ tục xóa 1 sinh viên
    public void removeStudent1() {
        boolean run = true;

        System.out.println("Tat ca Sinh Vien la: ");
        displayAll(students);

        while (run) {
            System.out.print("ID SV can xoa la: ");
            Scanner in = new Scanner(System.in);
            String id = in.next();

            run = !removeStudent(id);
        }
    }

    /////////////////// In toàn bộ sinh viên
    public void displayAll(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("+" + (1 + i) + ":");
            students.get(i).getInfo();
        }
    }

    public static void main(String[] args) {

        StudentManagement manage = new StudentManagement();
        Test test = new Test();


        //*************************************Phan 6*************************************

        System.out.println("\n*********************Phan 6************************\n");
        Student me = new Student("Nguyen Trong Ha", "1020933", "K61CB", "Trongha.hd.98@gmail.com");
        System.out.println("Ten SV la: " + me.getName());
        System.out.println("Tat ca thong tin la: ");
        me.getInfo();


        //*************************************Phan 7,8*************************************

        System.out.println("\n*********************Phan 7,8************************\n");
        Student s1 = new Student(me);
        Student s2 = new Student();
        Student s3 = new Student("Ho va ten", "1234567", "Abcxyz@gmail.com");
        students.add(s1);
        students.add(s2);
        students.add(s3);

        for (int i = 0; i < students.size(); i++) {
            students.get(i).getInfo();
        }

        //*************************************Phan 9,10*************************************

        System.out.println("\n*********************Phan 9,10************************\n");
        s1 = new Student("SV 1", "", "K59CLC", "");
        s2 = new Student("Sv 2", "", "K59CLC", "");
        s3 = new Student();
        students.clear();
        students.add(0, s1);
        students.add(1, s2);
        students.add(2, s3);
        manage.displayAll(students);
        for (int i = 0; i < students.size() - 1; i++)
            for (int j = i + 1; j < students.size(); j++) {

                System.out.print(students.get(i).getName() + " va " + students.get(j).getName() + "  ");
                if (manage.sameGroup(students.get(i), students.get(j)))
                    System.out.println("Cung Nhom");
                else System.out.println("Ko Cung Nhom");
            }
        students.add(0, s1);
        for (int i = 0; i < students.size(); i++) {
            students.get(i).getInfo();
        }

        //*************************************Phan 12*************************************

        System.out.println("\n*********************Phan 12************************\n");
        students = test.setTest();
        System.out.println("Danh sach sv la: ");
        manage.displayAll(students);
        System.out.println("Danh sach theo Group la:");
        manage.studentByGroup();


        //*************************************Phan 13*************************************

        System.out.println("\n*********************Phan 13************************\n");
        manage.removeStudent1();

        System.out.print("end");
        /*for (Student s: manage.students){
            s.getInfo();
        }*/
    }
}

package com.NTHa16020933;

import java.util.ArrayList;

/**
 * Created by Trong on 18/9/2017.
 */
public class Test {
    public ArrayList<Student> setTest(){
        ArrayList<Student> students = new ArrayList<Student>();
        Student s = new Student();
        students.add(s);
        s = new Student("", "", "K61CB", "");
        students.add(s);
        s = new Student("", "", "K61CC", "");
        students.add(s);
        s = new Student("", "", "K61CB", "");
        students.add(s);
        s = new Student("", "", "K61CC", "");
        students.add(s);
        s = new Student("", "", "K59CA", "");
        students.add(s);
        s = new Student("", "", "K61CB", "");
        students.add(s);
        s = new Student("", "", "K61CC", "");
        students.add(s);
        s = new Student("", "", "K59CA", "");
        students.add(s);
        s = new Student("", "", "K61CC", "");
        students.add(s);
        s = new Student("", "", "K59CA", "");
        students.add(s);
        for (int i=0 ; i<students.size() ; i++){
            students.get(i).setName("SV " + String.valueOf(i));
            students.get(i).setId(String.valueOf(i+12345));
        }
            return students;
    }

}

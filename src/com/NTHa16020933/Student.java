package com.NTHa16020933;

/**
 * Created by Trong on 17/9/2017.
 */
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;



    public Student() {
        setName("Student");
        setId("000");
        setGroup("K59CB");
        setEmail("uet@vnu.edu.vn");
    }

    public Student(String n, String sid, String em) {
        setName(n);
        setId(sid);
        setEmail(em);
        setGroup("K59CB");
    }

    public Student(Student s) {
        setName(s.name);
        setId(s.id);
        setEmail(s.email);
        setGroup(s.group);
    }

    public Student(String _name, String _id, String _group , String _email ) {
        setName(_name);
        setId(_id);
        setGroup(_group);
        setEmail(_email);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public String getInfo() {
        System.out.println( "Name : " + name + "\nID   : " + id + "\nGroup: " + group + "\nEmail: " + email);
        return ("\nName : " + name + "\nID   : " + id + "\nGroup: " + group + "\nEmail: " + email + "\n");
    }

}

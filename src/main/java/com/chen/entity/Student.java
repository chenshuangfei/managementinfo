package com.chen.entity;

public class Student {
    private String name;

    private String studentid;

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    private String emial;

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    public String getStudentid() {
        return studentid;
    }
}

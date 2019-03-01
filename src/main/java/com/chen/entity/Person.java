package com.chen.entity;

public class Person {
    private String name;

    private String studentNn;

    public String getStudentNn() {
        return studentNn;
    }

    public void setStudentNn(String studentNn) {
        this.studentNn = studentNn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, String studentNn) {
        this.name = name;
        this.studentNn = studentNn;
    }

    public static void main(String[] args) {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public void getfenzhi(){

    }

}

package com.company;

public class Student {
    private String name;
    private int id;
    private String birthday;
    private boolean gender;

    public Student(String name,int id,String birthday,boolean gender){
        this.name=name;
        this.birthday=birthday;
        this.id=id;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}

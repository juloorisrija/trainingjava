package com.training.collections;

public class Student {
    int studId,age;
   String studName, collegeName;

    public Student(int studId, int age, String studName, String collegeName) {
        this.studId = studId;
        this.age = age;
        this.studName = studName;
        this.collegeName = collegeName;
    }

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", age=" + age +
                ", studName='" + studName + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}

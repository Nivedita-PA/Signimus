package com.Nivedita.Task5;

public class Student extends Person{
    private int studentID;
    private String field;
    public Student(int age, String name, int studentID, String field){
        super(age,name);
        this.studentID = studentID;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Student{" +"age=" + getAge() + "name=" + getName() +
                "studentID=" + studentID +
                ", field='" + field + '\'' +
                '}';
    }
}

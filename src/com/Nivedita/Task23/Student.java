package com.Nivedita.Task23;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastname;
    private int age;
    private int height;

    public Student(String firstName, String lastname, int age, int height) {
//        if(this.firstName.length()<2) throw new IllegalArgumentException("Add a valid firstName");
        this.firstName = firstName;
        this.lastname = lastname;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.age);
    }
}

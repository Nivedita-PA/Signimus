package com.Nivedita.Task20;

import java.time.LocalDate;
import java.time.Period;

public final class Person {
    private final String name;
    private final  String lastname;
    private LocalDate dateOfBirth;

    public Person(String name, String lastname, LocalDate dateOfBirth) {
        if(name==null || lastname ==null || dateOfBirth==null) throw new IllegalArgumentException("Fields cannot be null");
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
    public String getFullName(){
        return this.name +" "+ this.lastname;
    }

    public int getAge(){
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void main(String[] args) {
        Person person = new Person("Nivedita", "Pal", LocalDate.of(1996,12,16));
        System.out.println(person);
        System.out.println(person.getFullName());
        System.out.println(person.getAge());
    }
}

package com.Nivedita.Task17;

import java.util.PriorityQueue;

public class Hospital {
    public static void main(String[] args) {
        PriorityQueue<Patient> patients = new PriorityQueue<>(new PatientEmergency());
        patients.add(new Patient(1,3));
        patients.add(new Patient(2,4));
        patients.add(new Patient(3,5));
        patients.add(new Patient(4,1));
        patients.add(new Patient(5,2));

        System.out.println("Patients prioritized in urgency order");
        System.out.println(patients+" ");
    }
}

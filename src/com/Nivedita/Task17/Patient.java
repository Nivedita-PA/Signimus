package com.Nivedita.Task17;

public class Patient {
    private int patientNo;
    private int urgencyToken;

    public Patient(int patientNo, int urgencyToken) {
        this.patientNo = patientNo;
        this.urgencyToken = urgencyToken;
    }

    public int getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(int patientNo) {
        this.patientNo = patientNo;
    }

    public int getUrgencyToken() {
        return urgencyToken;
    }

    public void setUrgencyToken(int urgencyToken) {
        this.urgencyToken = urgencyToken;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientNo=" + patientNo +
                ", urgencyToken=" + urgencyToken +
                '}';
    }
}

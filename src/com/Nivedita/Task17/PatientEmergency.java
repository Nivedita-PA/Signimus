package com.Nivedita.Task17;

import java.util.Comparator;

public class PatientEmergency implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return  (o1.getUrgencyToken()<o2.getUrgencyToken()) ? -1:1;
    }
}

package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_4_plus;

class AppointmentBooking {
    private String patientName;
    private String patientDiagnose;
    private int price;

    AppointmentBooking(String patientName,
                       String patientDiagnose,
                       int price) {
        this.patientName = patientName;
        this.patientDiagnose = patientDiagnose;
        this.price = price;
    }

    String getPatientName()     {return patientName;}
    String getPatientDiagnose() {return patientDiagnose;}
    int getPrice()              {return price;}
}

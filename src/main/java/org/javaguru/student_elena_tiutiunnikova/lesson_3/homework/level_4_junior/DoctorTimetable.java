package org.javaguru.student_elena_tiutiunnikova.lesson_3.homework.level_4_junior;

class DoctorTimetable {
    private String doctor;
    private String specialty;
    private String data;
    private String morningTime;
    private String afternoonTime;

    DoctorTimetable(String doctor,
                    String specialty,
                    String data,
                    String morningTime,
                    String afternoonTime) {
        this.doctor = doctor;
        this.specialty = specialty;
        this.data = data;
        this.morningTime = morningTime;
        this.afternoonTime = afternoonTime;
    }

    public String getDoctor () {return doctor;}
    public String getSpecialty () {return specialty;}
    public String getData () {return data;}
    public String getMorningTime () {return morningTime;}
    public String getAfternoonTime () {return afternoonTime;}

}

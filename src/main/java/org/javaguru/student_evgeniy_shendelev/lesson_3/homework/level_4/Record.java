package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_4;

public class Record {
    private String patientName;
    private String patientSurname;
    private String diagnosis;
    private int cost;

    public Record(String patientName, String patientSurname, String diagnosis, int cost) {
        this.patientName = patientName;
        this.patientSurname = patientSurname;
        this.diagnosis = diagnosis;
        this.cost = cost;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Record{");
        sb.append("patientName='").append(patientName).append('\'');
        sb.append(", patientSurname='").append(patientSurname).append('\'');
        sb.append(", diagnosis='").append(diagnosis).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}

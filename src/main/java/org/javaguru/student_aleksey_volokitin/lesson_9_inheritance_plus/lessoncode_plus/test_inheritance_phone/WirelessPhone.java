package org.javaguru.student_aleksey_volokitin.lesson_9_inheritance_plus.lessoncode_plus.test_inheritance_phone;

abstract class WirelessPhone extends AbstractPhone {

    private int batteryLife;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.batteryLife = hour;
    }
}
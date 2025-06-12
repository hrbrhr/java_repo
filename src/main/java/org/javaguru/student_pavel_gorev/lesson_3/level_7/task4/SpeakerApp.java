package org.javaguru.student_pavel_gorev.lesson_3.level_7.task4;

class SpeakerApp {
    public static void main(String[] args) {
        Speaker mySpeaker = new Speaker("JBL Charge 5");

        System.out.println("Model: " + mySpeaker.getModel());      // JBL Charge 5
        System.out.println("Is on: " + mySpeaker.isOn());          // false
        System.out.println("Volume: " + mySpeaker.getVolume());    // 0

        mySpeaker.turnOn();
        mySpeaker.increaseVolume();
        mySpeaker.increaseVolume();

        System.out.println("After turning on and increasing volume:");
        System.out.println("Is on: " + mySpeaker.isOn());          // true
        System.out.println("Volume: " + mySpeaker.getVolume());    // 2

        mySpeaker.turnOff();
        System.out.println("After turning off:");
        System.out.println("Is on: " + mySpeaker.isOn());          // false
        System.out.println("Volume: " + mySpeaker.getVolume());    // 0
    }
}


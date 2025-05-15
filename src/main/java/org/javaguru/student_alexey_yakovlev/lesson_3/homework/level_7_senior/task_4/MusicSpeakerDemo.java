package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_7_senior.task_4;

class MusicSpeakerDemo {

    public static void main(String[] args) {
        MusicSpeaker musicSpeaker = new MusicSpeaker("JBL");

        System.out.println("Volume = " + musicSpeaker.getVolume());
        System.out.println("isOn = " + musicSpeaker.isOn());

        musicSpeaker.on();

        System.out.println("isOn = " + musicSpeaker.isOn());
        System.out.println("Volume = " + musicSpeaker.getVolume());

        musicSpeaker.increaseSound();
        System.out.println("Volume = " + musicSpeaker.getVolume());

        musicSpeaker.off();
        System.out.println("Volume = " + musicSpeaker.getVolume());
    }
}

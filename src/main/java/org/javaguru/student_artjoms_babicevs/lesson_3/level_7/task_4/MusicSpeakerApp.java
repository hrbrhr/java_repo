package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_4;


public class MusicSpeakerApp {

    public static void main(String[] args) {
        MusicSpeaker speaker1 = new MusicSpeaker("JBL");

        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.on();

        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();
        speaker1.increaseVolume();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.off();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

        speaker1.on();

        System.out.println("Volume = " + speaker1.getVolume());
        System.out.println("IsOn = " + speaker1.isOn());

    }

}











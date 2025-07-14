package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_7.task_4;

class SpeakerDemo {
    public static void main(String[] args) {
        Speaker speaker = new Speaker("Alice");
        speaker.turnOn();
        for (int i = 0; i < 10; i++) {
            speaker.volumeUp();
        }
        System.out.println("Now volume is " + speaker.getVolume());
        for (int i = 0; i < 10; i++) {
            speaker.volumeDown();
        }
        System.out.println("Now volume is " + speaker.getVolume());
        speaker.turnOff();
    }
}

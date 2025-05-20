package org.javaguru.student_evgenii_pashtaev.lesson_3.level_7;

class SpeakerDemo {

    public static void main(String[] args) {

        Speaker speak = new Speaker("x 101");
        System.out.println(speak.condition);
        System.out.println(speak.volume);
        speak.enableSpeaker();
        System.out.println(speak.condition);
        speak.moreVolume();
        System.out.println(speak.levelVolume());
        speak.disableSpeaker();
        System.out.println(speak.getConditions());
        System.out.println(speak.getLevel());
        System.out.println(speak.getModel());
    }
}

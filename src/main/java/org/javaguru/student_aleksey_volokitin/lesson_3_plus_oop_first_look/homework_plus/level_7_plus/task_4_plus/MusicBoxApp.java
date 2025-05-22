package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.homework_plus.level_7_plus.task_4_plus;

class MusicBoxApp {
    public static void main(String[] args) {
        MusicBox musicBox = new MusicBox("JBL");

        musicBox.getStatus();
        musicBox.volumeUp(); // проверка увеличения громкости при выключенной колонке
        musicBox.powerOn();
        musicBox.getStatus();
        musicBox.volumeUp();
        musicBox.volumeUp();
        musicBox.volumeUp();
        musicBox.volumeUp();
        musicBox.volumeUp();
        musicBox.getStatus();
        musicBox.powerOff();
        musicBox.getStatus();
    }
}

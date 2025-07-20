package org.javaguru.student_vasilii_khvan.lesson_3.level_7.task_4;

class MusicSpeaker {

    private String model;
    private int volume;
    private String power;

    MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.power = "off";
    }

    void powerOn() {
        power = "on";
    }

    void powerOff() {
        power = "off";
        volume = 0;
    }

    void volumeUp() {
        if (this.power.equals("on") && volume < 10) {
            volume += 1;
        }
    }

    int getVolume() {
        return volume;
    }

    String getPower() {
        return power;
    }

    String getModel() {
        return model;
    }
}

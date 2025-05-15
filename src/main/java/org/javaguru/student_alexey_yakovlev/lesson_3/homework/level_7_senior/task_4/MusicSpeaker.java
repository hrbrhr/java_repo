package org.javaguru.student_alexey_yakovlev.lesson_3.homework.level_7_senior.task_4;

class MusicSpeaker {

    private String brand;
    private int volume;
    private boolean isOn;

    public MusicSpeaker(String brand) {
        this.brand = brand;
        this.isOn = false;
        this.volume = 0;
    }

    void on() {
        this.isOn = true;
    }

    void increaseSound() {
        if (isOn == true && volume < 10) {
            volume += 1;
        }
    }

    void off() {
        this.isOn = false;
        this.volume = 0;
    }

    public String getBrand() {
        return brand;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}

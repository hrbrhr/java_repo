package org.javaguru.student_artjoms_babicevs.lesson_3.level_7.task_4;

public class MusicSpeaker {
    private String model;
    private int volume;
    private boolean isOn;




    public MusicSpeaker(String model) {
        this.model = model;
        this.volume = 0;
        this.isOn = false;

    }


    public void on() {this.isOn = true;}
    public void off() {
        this.isOn = false;
        this.volume = 0;
    }

    public void increaseVolume() {
        if ((this.isOn == true) && (this.volume < 10)) {
            this.volume = this.volume + 1;
        }
    }
    public String getModel() {
        return this.model;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isOn() {
        return this.isOn;
    }
}









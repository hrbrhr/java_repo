package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.homework_plus.level_7_plus.task_4_plus;

class MusicBox {
    String model;
    int volumeLevel;
    boolean isOn;

    MusicBox(String model) {
        this.model = model;
        this.volumeLevel = 0;
        this.isOn = false;
    }

    void getStatus() {
        String status = "Model: " + this.model + ", volume level: " + this.volumeLevel + ", power status:" + this.isOn;
        System.out.println(status);;
    }

    void volumeUp() {
        if (isOn){
            this.volumeLevel += 1;
        }
        else{
            System.out.println("Music box " + this.model + " is turned off!!");
        }
    }

    void powerOn() {
        isOn = true;
    }
    void powerOff() {
        isOn = false;
        volumeLevel = 0;
    }
}

package org.javaguru.student_evgeniy_shendelev.lesson_3.homework.level_7.task_4;

class Speaker {
    private String model;
    private boolean isOn;
    private int volume;

    public Speaker(String model) {
        this.model = model;
        isOn = false;
        volume = 0;
    }

    void turnOn() {
        isOn = true;
        System.out.println("Hello");
    }

    void turnOff() {
        System.out.println("Bye Bye");
        isOn = false;
        volume = 0;
    }

    void volumeUp() {
        if (isOn && volume < 10) {
            volume++;
            System.out.println("SOUND UP! Volume is " + volume);
        }
        if (isOn && volume >= 10) {
            System.out.println("Volume is MAX");
        }
    }

    void volumeDown() {
        if (isOn && (volume <= 10 && volume > 0)) {
            volume--;
            System.out.println("SOUND DOWN! Volume is " + volume);
        }
        if (isOn && volume == 0) {
            System.out.println("Volume is MIN");
        }
    }

    public String getModel() {
        return model;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }
}

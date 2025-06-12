package org.javaguru.student_pavel_gorev.lesson_3.level_7.task4;

class Speaker {

    private String model;
    private int volume;
    private boolean isOn;

    // Конструктор: модель, колонка выключена, громкость = 0
    public Speaker(String model) {
        this.model = model;
        this.isOn = false;
        this.volume = 0;
    }

    // Метод: включить колонку
    public void turnOn() {
        isOn = true;
    }

    // Метод: увеличить уровень звука на 1, если колонка включена
    public void increaseVolume() {
        if (isOn && volume < 10) {
            volume++;
        }
    }

    // Метод: выключить колонку, сбросить громкость
    public void turnOff() {
        isOn = false;
        volume = 0;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }
}


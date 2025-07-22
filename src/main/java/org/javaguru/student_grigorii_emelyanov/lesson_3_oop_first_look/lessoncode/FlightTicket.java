package org.javaguru.student_grigorii_emelyanov.lesson_3_oop_first_look.lessoncode;

import java.util.Date;

//Создать класс, который описывает билет на самолет.
//        У объектов этого класса должны быть следующие свойства:
//        - название аэропорта отправления;
//        - название аэропорта прибытия;
//        - дата и время вылета;
//        - дата и время прилёта.
//
//        Цель:
//        - научиться создавать классы для представления
//        сложных объектов из реального мира;
//        - познакомиться с типом данных java.util.Date
//        для задания даты и времени.
public class FlightTicket {
    private String departureAirport;
    private String arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public FlightTicket(String departureAirport, String arrivalAirport, Date departureTime, Date arrivalTime) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }
}

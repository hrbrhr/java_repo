package org.javaguru.student_grigoriy_emiliyanov.lesson_3_oop_first_look.lessoncode;

import java.util.Date;

public class FlightTicketApplication {
    public static void main(String[] args) {
        Date departureTime = new Date(2025, 5, 1, 12, 0);
        Date arrivalTime = new Date(2025, 5, 1, 15, 45);

        FlightTicket ticket = new FlightTicket("Paris", "Moscow", departureTime, arrivalTime);

        System.out.println("Your ticket:");
        System.out.println("Departure Airport: " + ticket.getDepartureAirport());
        System.out.println("Arrival Airport: " + ticket.getArrivalAirport());
        System.out.println("Departure time: " + ticket.getDepartureTime());
        System.out.println("Arrival time: " + ticket.getArrivalTime());
    }
}

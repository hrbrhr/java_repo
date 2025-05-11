package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_11_plus;

import java.util.Date;

// Date date = new Date(125, 4, 111); // 15 мая 2025 (год с 1900, месяц 0-11)
class PlaneTicketApp {
    public static void main(String[] args) {
        Date departureDate1 = new Date(125, 4, 11, 8, 10, 0);
        Date arrivalDate1 = new Date(125, 4, 11, 10, 30, 0);
        PlaneTicket planeTicket1 = new PlaneTicket("Chita",
                                                      "Moscow",
                                                                 departureDate1,
                                                                 arrivalDate1);
        System.out.println("Flight:" + planeTicket1.getDepartureAirport() +
                           " - " + planeTicket1.getArrivalAirport() +
                           "\n" +
                           "departure: " + planeTicket1.getDepartureDate() +
                           ", arrival: " + planeTicket1.getArrivalDate());

        arrivalDate1.setHours(11);
        arrivalDate1.setMinutes(40);

        System.out.println("Flight:" + planeTicket1.getDepartureAirport() +
                " - " + planeTicket1.getArrivalAirport() +
                "\n" +
                "departure: " + planeTicket1.getDepartureDate() +
                ", arrival: " + planeTicket1.getArrivalDate());
    }
}

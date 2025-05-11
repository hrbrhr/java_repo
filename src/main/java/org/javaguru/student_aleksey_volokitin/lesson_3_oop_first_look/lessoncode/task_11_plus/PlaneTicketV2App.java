package org.javaguru.student_aleksey_volokitin.lesson_3_oop_first_look.lessoncode.task_11_plus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PlaneTicketV2App {
    public static void main(String[] args) {

        LocalDateTime departureDate1 = LocalDateTime.of(2025, 5, 11, 8, 10);
        LocalDateTime arrivalDate1 = LocalDateTime.of(2025, 5, 11, 10, 30);

        PlaneTicketV2 planeTicket1 = new PlaneTicketV2("Chita",
                                                      "Moscow",
                                                                 departureDate1, arrivalDate1);


        System.out.println("Flight:" + planeTicket1.getDepartureAirport() +
                           " - " + planeTicket1.getArrivalAirport() +
                           "\n" +
                           "departure: " + planeTicket1.getDepartureDate() +
                           ", arrival: " + planeTicket1.getArrivalDate());

        // Форматируем дату вылета и прилета в нужный формат, 11.05.2025 08.10
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        LocalDateTime formattingDepartureDate1 = planeTicket1.getDepartureDate();
        String formattedDepartureDate1 = formattingDepartureDate1.format(formatter);
        LocalDateTime formattingArrivalDate1 = planeTicket1.getArrivalDate();
        String formattedArrivalDate1 = formattingArrivalDate1.format(formatter);

        System.out.println("Flight:" + planeTicket1.getDepartureAirport() +
                " - " + planeTicket1.getArrivalAirport() +
                "\n" +
                "departure: " + formattedDepartureDate1 +
                ", arrival: " + formattedArrivalDate1);

        // Изменяем дату прилета. Т.к. объект LocalDateTime иммутабельный, то создаем новый объект
        LocalDateTime newArrivalDate1 = LocalDateTime.of(2025, 5, 11, 11, 45);
        planeTicket1.setArrivalDate(newArrivalDate1);

        formattingArrivalDate1 = planeTicket1.getArrivalDate();
        formattedArrivalDate1 = formattingArrivalDate1.format(formatter);
        System.out.println("Flight:" + planeTicket1.getDepartureAirport() +
                " - " + planeTicket1.getArrivalAirport() +
                "\n" +
                "departure: " + formattedDepartureDate1 +
                ", arrival: " + formattedArrivalDate1);
    }
}

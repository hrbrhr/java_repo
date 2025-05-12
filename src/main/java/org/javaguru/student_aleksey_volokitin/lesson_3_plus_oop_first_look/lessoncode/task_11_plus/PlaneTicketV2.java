package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_11_plus;

import java.time.LocalDateTime;

class PlaneTicketV2 {
    private String departureAirport;
    private String arrivalAirport;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;


    PlaneTicketV2(String departureAirport,
                  String arrivalAirport,
                  LocalDateTime departureDate,
                  LocalDateTime arrivalDate) {
        this.departureAirport = departureAirport;
        this.arrivalAirport   = arrivalAirport;
        this.departureDate    = departureDate;
        this.arrivalDate      = arrivalDate;
    }

    String getDepartureAirport()          { return departureAirport; }
    String getArrivalAirport()            { return arrivalAirport; }
    LocalDateTime getDepartureDate()      { return departureDate; }
    LocalDateTime getArrivalDate()        { return arrivalDate; }

    void setDepartureAirport(String newDepartureAirport) { this.departureAirport = newDepartureAirport; }
    void setArrivalAirport(String newArrivalAirport)     { this.arrivalAirport   = newArrivalAirport; }
    void setDepartureDate(LocalDateTime newDepartureDate){ this.departureDate    = newDepartureDate; }
    void setArrivalDate(LocalDateTime newArrivalDate)    { this.arrivalDate      = newArrivalDate; }
}

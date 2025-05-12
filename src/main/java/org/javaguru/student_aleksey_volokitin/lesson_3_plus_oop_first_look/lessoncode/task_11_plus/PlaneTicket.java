package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_11_plus;

import java.util.Date;

class PlaneTicket {
    private String departureAirport;
    private String arrivalAirport;
    private Date departureDate;
    private Date arrivalDate;


    PlaneTicket(String departureAirport,
                String arrivalAirport,
                Date departureDate,
                Date arrivalDate) {
        this.departureAirport = departureAirport;
        this.arrivalAirport   = arrivalAirport;
        this.departureDate    = departureDate;
        this.arrivalDate      = arrivalDate;
    }

    String getDepartureAirport() { return departureAirport; }
    String getArrivalAirport()   { return arrivalAirport; }
    Date getDepartureDate()      { return departureDate; }
    Date getArrivalDate()        { return arrivalDate; }

    void setDepartureAirport(String newDepartureAirport) { this.departureAirport = newDepartureAirport; }
    void setArrivalAirport(String newArrivalAirport)     { this.arrivalAirport   = newArrivalAirport; }
    void setDepartureDate(Date newDepartureDate)         { this.departureDate    = newDepartureDate; }
    void setArrivalDate(Date newArrivalDate)             { this.arrivalDate      = newArrivalDate; }
}

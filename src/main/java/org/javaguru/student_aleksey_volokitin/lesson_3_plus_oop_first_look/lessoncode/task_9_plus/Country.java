package org.javaguru.student_aleksey_volokitin.lesson_3_plus_oop_first_look.lessoncode.task_9_plus;

class Country {
    private String name;
    private String codeCountry;
    private int population;

    Country(String name,
            String codeCountry,
            int population) {
        this.name = name;
        this.codeCountry = codeCountry;
        this.population = population;
    }

    String getName()        {return name;}
    String getCodeCountry() {return codeCountry;}
    int getPopulation()     {return population;}

    void setName(String newName)               {this.name = newName;}
    void setCodeCountry(String newCodeCountry) {this.codeCountry = newCodeCountry;}
    void setPopulation(int newPopulation)      {this.population = newPopulation;}
}

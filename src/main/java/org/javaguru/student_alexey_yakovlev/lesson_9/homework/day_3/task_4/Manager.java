package org.javaguru.student_alexey_yakovlev.lesson_9.homework.day_3.task_4;

 class Manager extends Salary {

     private int extraWorkDays;

     public Manager(String name, String surname, int salaryAmount, int extraWorkDays) {
         super(name, surname, salaryAmount);
         this.extraWorkDays = extraWorkDays;
     }
 }

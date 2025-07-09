package org.javaguru.student_vitalii_lutsenko.project_0.task_3;

class GradeCalculatorApplication {

    public static void main(String[] args) {

       GradeCalculator calculator = new GradeCalculator();

       String grade1 = calculator.calculateGrade(81);
       String grade2 = calculator.calculateGrade(99);
       String grade3 = calculator.calculateGrade(0);
       String grade4 = calculator.calculateGrade(100);
       String grade5 = calculator.calculateGrade(670);
       String grade6 = calculator.calculateGrade(62);
       String grade7 = calculator.calculateGrade(75);
       String grade8 = calculator.calculateGrade(69);


       System.out.println(grade1);
       System.out.println(grade2);
       System.out.println(grade3);
       System.out.println(grade4);
       System.out.println(grade5);
       System.out.println(grade6);
       System.out.println(grade7);
       System.out.println(grade8);






       //100, 76, 23, 11, 67, 88.

    }

}

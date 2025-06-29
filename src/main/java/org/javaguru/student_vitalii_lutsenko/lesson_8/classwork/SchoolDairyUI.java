package org.javaguru.student_vitalii_lutsenko.lesson_8.classwork;

import java.util.Scanner;

class SchoolDairyUI {

     private SchoolDairy schoolDairy;

      SchoolDairyUI(SchoolDairy schoolDairy) {
          this.schoolDairy = schoolDairy;
      }

      void start() {
          //
          while (true) {

              System.out.println("");

              // print menu
              System.out.println("Program menu");
              System.out.println("1. Add mark");
              System.out.println("2. Find max mark by subject");
              System.out.println("3. Exit");

              // get menu item from user
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter menu item to execute:");
              int menuItem = Integer.parseInt(scanner.nextLine());

              // execute menu item (.....)
              if (menuItem == 1) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();

                  System.out.println("Enter mark value:");
                  int markValue = Integer.parseInt(scanner.nextLine());

                  schoolDairy.addMark(subject, markValue);

                  System.out.println("Add mark finished!");
              }

              if (menuItem == 2) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();

                  int maxGrade = schoolDairy.findMaxMark(subject);
                  System.out.println("Max grade by " + subject + " is = " + maxGrade);

                  System.out.println("Find max mark by subject finished!");
              }

              if (menuItem == 3) {
                  // 3. Exit
                  System.out.println("Goodbye!");
                  System.exit(0);
                  //break; prepivanie  beskonechnogo cikla "while"
              }

          }
      }




}

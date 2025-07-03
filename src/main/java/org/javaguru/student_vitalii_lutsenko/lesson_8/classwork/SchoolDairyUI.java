package org.javaguru.student_vitalii_lutsenko.lesson_8.classwork;

import java.util.Scanner;

class SchoolDairyUI {

     private SchoolDairy schoolDairy;

      SchoolDairyUI(SchoolDairy schoolDairy) {
          this.schoolDairy = schoolDairy;
      }

      void start() {
          while (true) {
              System.out.println("Hello");
              // print menu
              System.out.println("===========================");
              System.out.println("Program menu");
              System.out.println("1. Add mark");
              System.out.println("2. Find max mark by subject ");
              System.out.println("3. Find min mark by subject " );
              System.out.println("4. Find average by subject " );
              System.out.println("5. Find average for all subjects " );
              System.out.println("6. Exit");
              System.out.println("===========================");

              // get menu item from user
              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter menu item to execute:");
              int menuItem = Integer.parseInt(scanner.nextLine());

              // 1.execute menu item (.....)
              if (menuItem == 1) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();
                  System.out.println("Enter mark value:");
                  int markValue = Integer.parseInt(scanner.nextLine());
                  schoolDairy.addMark(subject, markValue);
                  System.out.println("Add mark finished!");
                  System.out.println("Press Enter to continue...");
                  scanner.nextLine();
              }

              // 2.Find max mark by subject
              if (menuItem == 2) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();
                  int maxGrade = schoolDairy.findMaxMark(subject);
                  System.out.println("Max grade by " + subject + " is = " + maxGrade);
                  System.out.println("Find max mark by subject finished!");
                  System.out.println("Press Enter to continue...");
                  scanner.nextLine();
              }

              // 3.Find min mark by subject
              if (menuItem == 3) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();
                  int minGrade = schoolDairy.findMinMark(subject);
                  System.out.println("Min grade by " + subject + " is = " + minGrade);
                  System.out.println("Find min mark by subject finished!");
                  System.out.println("Press Enter to continue...");
                  scanner.nextLine();
              }

              // 4.Find average by subject
              if (menuItem == 4) {
                  System.out.println("Enter mark subject:");
                  String subject = scanner.nextLine();
                  int averageBySubject = schoolDairy.findAverageBySubject(subject);
                  System.out.println("Average by subject " +subject+ " is = "+ averageBySubject);
                  System.out.println("Find average mark by subject finished!");
                  System.out.println("Press Enter to continue...");
                  scanner.nextLine();
              }

              // 5.Find average for all subject
              if (menuItem == 5) {
                  int averageForAllSubjects = schoolDairy.findAverageForAllSubjects();
                  System.out.println("Average mark for all subject  is = " + averageForAllSubjects);
                  System.out.println("Find average mark for all subject finished!");
                  System.out.println("Press Enter to continue...");
                  scanner.nextLine();
              }

              if (menuItem == 6) {
                  // 5. Exit
                  System.out.println("Goodbye!");
                  System.exit(0);
                  //break; prepivanie  beskonechnogo cikla "while"
              }

          }
      }




}

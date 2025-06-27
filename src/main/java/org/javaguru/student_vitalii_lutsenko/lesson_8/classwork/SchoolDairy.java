package org.javaguru.student_vitalii_lutsenko.lesson_8.classwork;

import java.util.ArrayList;
import java.util.List;

 class SchoolDairy {

     private List<Mark> marks ;

     public SchoolDairy() {
         this.marks = new ArrayList<>();
     }
    void addMark(String subject, int markValue) {
         Mark mark = new Mark(subject,markValue);
         marks.add(mark);

    }

     //test case 1 : {subject = "Math" , mark = 5} , "Math" = 5
     //test case 2 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 4}, "Math" = 5
     //test case 3 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 5}, "Math" = 5
     //test case 4 : {} , "Math" = 0
     //test case 5 : {subject = "Math" , mark = 5} , {subject = "Eng", mark = 10}, "Math" = 5

     public int findMaxMark(String subject) {
         int maxMark = 0;

       /*  for (int i = 0; i < marks.size(); i++) {
             Mark mark = marks.get(i);
             }
       */

         for (Mark mark : marks) {
             if (mark.getSubject().equals(subject) && mark.getMark() >maxMark){
                 maxMark = mark.getMark();
             }
         }
         return maxMark;
     }
     //test case 1 : {subject = "Math" , mark = 3} , "Math" = 3
     //test case 2 : {subject = "Math" , mark = 5} , {subject = "Math", mark = 10}, "Math" = 5
     //test case 3 : {subject = "Math" , mark = 8} , {subject = "Math", mark = 3}, "Math" = 3
     //test case 4 : {} , "Math" = 0
     //test case 5 : {subject = "Eng" , mark = 7} , {subject = "Math", mark = 10}, "Math" = 10

     public int findMinMark(String subject) {
         int minMark = 11;
         for (Mark mark : marks) {
             if(mark.getSubject().equals(subject) && mark.getMark() < minMark) {
                 minMark = mark.getMark();
             }
         }
         if (minMark == 11) {
             minMark =0;
         }
         return minMark;
     }



/*
     public int findMinMark(String subject) {
         int minGrade = 10;

         for (int i = 0; i < marks.size(); i++) {
             Mark mark = marks.get(i);
             if (mark.getSubject().equals(subject)) {
                 if (marks.g() < minGrade) {
                     minGrade = marks.getValue();
                 }
             }
         }
         if (minGrade == 10) {
             minGrade = 0;
         }
         return minGrade;

     }
*/

}

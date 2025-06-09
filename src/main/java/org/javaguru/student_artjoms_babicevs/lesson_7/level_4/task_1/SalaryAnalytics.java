package org.javaguru.student_artjoms_babicevs.lesson_7.level_4.task_1;

 class SalaryAnalytics {

    public static void main(String[] args) {
     double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};

     double total = calculateTotal(salaries);
     double min = findMin(salaries);
     double max = findMax(salaries);
     double average = calculateAverage(salaries);
     double standardDeviation = calculateStandardDeviation(salaries);

     System.out.println("Total" + total);
     System.out.println("Min" + min);
     System.out.println("Max" + max);
     System.out.println("Average" + total);
     System.out.println("StandardDeviation" + standardDeviation);
}

   public static double calculateTotal(double[] salaries) {
     double sum = 0.00;
     for(double salary : salaries) {
      sum += salary;
     }
  return  sum;
    }
   public static double findMin(double[] salaries) {
   double min = salaries[0];
   for (double salary : salaries) {
    if (salary < min) {
     min = salary;
    }
   }
   return min;
  }
  public static double findMax(double[] salaries) {
   double max = salaries[0];
   for (double salary : salaries) {
    if (salary > max) {
     max = salary;
    }
   }
   return max;
  }
  public static double calculateAverage(double[] salaries) {
   return calculateTotal(salaries) / salaries.length;
  }
  public static double calculateStandardDeviation(double[] salaries) {
   double avg = calculateAverage(salaries);
   double sumOfSquares = 0.0;
   for (double salary : salaries) {
    double diff = salary - avg;
    sumOfSquares += diff * diff;
   }
   double variance = sumOfSquares / salaries.length;
   return Math.sqrt(variance);
  }
 }


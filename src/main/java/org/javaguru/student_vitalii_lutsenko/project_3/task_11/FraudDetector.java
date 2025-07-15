package org.javaguru.student_vitalii_lutsenko.project_3.task_11;

 class FraudDetector {

     private final FraudRule1 rule1 = new FraudRule1();
     private final FraudRule2 rule2 = new FraudRule2();
     private final FraudRule3 rule3 = new FraudRule3();
     private final FraudRule4 rule4 = new FraudRule4();
     private final FraudRule5 rule5 = new FraudRule5();

     boolean isFraud (Transaction transaction) {
         return rule1.isFraud(transaction)
                 || rule2.isFraud(transaction)
                 || rule3.isFraud(transaction)
                 || rule4.isFraud(transaction)
                 || rule5.isFraud(transaction);
     }

}

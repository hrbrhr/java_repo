package org.javaguru.student_vitalii_lutsenko.project_3.task_15;


import java.util.List;

class FraudDetector {

     private final List<FraudRule> rules= List.of(
                  new FraudRule1(),
                  new FraudRule2(),
                  new FraudRule3(),
                  new FraudRule4(),
                  new FraudRule5()
          );

     FraudDetectionResult isFraud(Transaction transaction) {
          for (FraudRule rule : rules) {
               if (rule.isFraud(transaction)) {
                    String ruleName = rule.getRuleName();
                    return new FraudDetectionResult(true, ruleName);
               }
          }
          return new FraudDetectionResult(false, null);
     }



    /* private final FraudRule1 rule1 = new FraudRule1();
     private final FraudRule2 rule2 = new FraudRule2();
     private final FraudRule3 rule3 = new FraudRule3();
     private final FraudRule4 rule4 = new FraudRule4();
     private final FraudRule5 rule5 = new FraudRule5();

     FraudDetectionResult isFraud(Transaction transaction){
          if(rule1.isFraud(transaction)){
               return new FraudDetectionResult(true,"FraudRule1");
          }
          if(rule2.isFraud(transaction)){
               return new FraudDetectionResult(true,"FraudRule2");
          }
          if(rule3.isFraud(transaction)){
               return new FraudDetectionResult(true,"FraudRule3");
          }
          if(rule4.isFraud(transaction)){
               return new FraudDetectionResult(true,"FraudRule4");
          }
          if(rule5.isFraud(transaction)){
               return new FraudDetectionResult(true,"FraudRule5");
          }
          return new FraudDetectionResult(false, null);
*/

}

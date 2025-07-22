package org.javaguru.student_vitalii_lutsenko.project_3.task_15;

 class FraudDetectionResult {

     private final boolean fraud;
     private final String ruleName;

    public FraudDetectionResult(boolean fraud,String ruleName){
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

     public boolean isFraud() {
         return fraud;
     }

     public String getRuleName() {
         return ruleName;
     }
 }

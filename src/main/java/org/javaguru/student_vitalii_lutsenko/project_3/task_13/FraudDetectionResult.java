package org.javaguru.student_vitalii_lutsenko.project_3.task_13;

 class FraudDetectionResult {

     private boolean fraud;
     private String ruleName;

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

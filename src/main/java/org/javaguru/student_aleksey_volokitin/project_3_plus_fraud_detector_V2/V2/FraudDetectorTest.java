package org.javaguru.student_aleksey_volokitin.project_3_plus_fraud_detector_V2.V2;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorRule1Test fraudDetectorRule1Test = new FraudDetectorRule1Test();
        FraudDetectorRule2Test fraudDetectorRule2Test = new FraudDetectorRule2Test();
        FraudDetectorRule3Test fraudDetectorRule3Test = new FraudDetectorRule3Test();
        FraudDetectorRule4Test fraudDetectorRule4Test = new FraudDetectorRule4Test();
        FraudDetectorRule5Test fraudDetectorRule5Test = new FraudDetectorRule5Test();

        // Testing Rule 1
        fraudDetectorRule1Test.rule1Test1();
        fraudDetectorRule1Test.rule1Test2();
        fraudDetectorRule1Test.rule1Test3();
        fraudDetectorRule1Test.rule1Test4();
        fraudDetectorRule1Test.rule1Test5();
        fraudDetectorRule1Test.rule1Test6();
        fraudDetectorRule1Test.rule1Test7();
        // Testing Rule 2
        fraudDetectorRule2Test.rule2Test1();
        fraudDetectorRule2Test.rule2Test2();
        fraudDetectorRule2Test.rule2Test3();
        // Testing Rule 3
        fraudDetectorRule3Test.rule3Test1();
        fraudDetectorRule3Test.rule3Test2();
        fraudDetectorRule3Test.rule3Test3();
        fraudDetectorRule3Test.rule3Test4();
        fraudDetectorRule3Test.rule3Test5();
        // Testing Rule 4
        fraudDetectorRule4Test.rule4Test1();
        fraudDetectorRule4Test.rule4Test2();
        fraudDetectorRule4Test.rule4Test3();
        fraudDetectorRule4Test.rule4Test4();
        fraudDetectorRule4Test.rule4Test5();
        // Testing Rule 5
        fraudDetectorRule5Test.rule5Test1();
        fraudDetectorRule5Test.rule5Test2();
        fraudDetectorRule5Test.rule5Test3();
        fraudDetectorRule5Test.rule5Test4();
        fraudDetectorRule5Test.rule5Test5();
        fraudDetectorRule5Test.rule5Test6();
    }
}

package org.javaguru.student_anastassija.lesson_6;

class CalculatorTest {
//test eto programka
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();//zapusk testov
        test.test1();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
    }
    // 2 -> true boolean
    public void test1() {
        int number = 2;//zadajom testovye dannye

        Calculator calculator = new Calculator();//vyzyvaem production code
        //vyzyvaem u etogo klassa metod i sohranjaem ego v bolevu peremennuju realResult
        boolean realResult = calculator.isEven(number);
        //teper sravnivaem to, sto poluchili s tem, sto ozidali
        if (realResult == true){
            System.out.println("TEST 1 = OK");
        } else {
            System.out.println("TEST 1 = FALSE");
            }
        }
    // 3 -> false boolean
    public void test2() {
        int number = 3;//zadajom testovye dannye

        Calculator calculator = new Calculator();//vyzyvaem production code
        //vyzyvaem u etogo klassa metod i sohranjaem ego v bolevu peremennuju realResult
        boolean realResult = calculator.isEven(number);
        //teper sravnivaem to, sto poluchili s tem, sto ozidali
        if (realResult == false){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FALSE");
        }
    }
    // 2->false boolean
    public void test3() {
        int number = 2;//zadajom testovye dannye

        Calculator calculator = new Calculator();//vyzyvaem production code
        //vyzyvaem u etogo klassa metod i sohranjaem ego v bolevu peremennuju realResult
        boolean realResult = calculator.isOdd(number);
        //teper sravnivaem to, sto poluchili s tem, sto ozidali
        if (realResult == false){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FALSE");
        }
    }
    //3 -> true boolean
    public void test4() {
        int number = 3;//zadajom testovye dannye

        Calculator calculator = new Calculator();//vyzyvaem production code
        //vyzyvaem u etogo klassa metod i sohranjaem ego v bolevu peremennuju realResult
        boolean realResult = calculator.isOdd(number);
        //teper sravnivaem to, sto poluchili s tem, sto ozidali
        if (realResult == true){
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FALSE");
        }
    }
    //findAverage(number1, number2)
    //2,4 -> 3.0 double
       public void  test5(){
           int number1 = 2;
           int number2 = 4;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage2(number1,number2);

        if (Math.abs(realResult - 3.0) < 0.00001){
            System.out.println("TEST 5 = OK");
        } else {
            System.out.println("TEST 5 = FALSE");
        }
    }
    //10,1 -> 5.5 double
    public void  test6(){
        int number1 = 10;
        int number2 = 1;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage2(number1,number2);

        if (Math.abs(realResult - 5.5) < 0.00001){
            System.out.println("TEST 6 = OK");
        } else {
            System.out.println("TEST 6 = FALSE");
        }
    }
    //1,1 -> 1.0 double
    public void  test7(){
        int number1 = 1;
        int number2 = 1;

        Calculator calculator = new Calculator();
        double realResult = calculator.findAverage2(number1,number2);

        if (Math.abs(realResult - 1.0) < 0.00001){
            System.out.println("TEST 7 = OK");
        } else {
            System.out.println("TEST 7 = FALSE");
        }
    }
    //findMax (number1, number2)
    //1,2 -> 2
    public void  test8(){
        int number1 = 1;
        int number2 = 2;

        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1,number2);

        if (realResult == 2){
            System.out.println("TEST 8 = OK");
        } else {
            System.out.println("TEST 8 = FALSE");
        }
    }
    //7,4 -> 7
    public void  test9(){
        int number1 = 7;
        int number2 = 4;

        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1,number2);

        if (realResult == 7){
            System.out.println("TEST 9 = OK");
        } else {
            System.out.println("TEST 9 = FALSE");
        }
    }
    //3,3 -> 3
    public void  test10(){
        int number1 = 3;
        int number2 = 3;

        Calculator calculator = new Calculator();
        int realResult = calculator.findMax(number1,number2);

        if (realResult == 3){
            System.out.println("TEST 10 = OK");
        } else {
            System.out.println("TEST 10 = FALSE");
        }
    }




    }




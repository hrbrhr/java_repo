package org.javaguru.student_evgenii_pashtaev.lesson_5.lessoncode;

public class NumberTest {

    public static void main(String[] args) {

        NumberTest number = new NumberTest();
        number.test1();
        number.test2();
        number.test3();
        number.test4();
        number.test5();
        number.test6();
        number.test7();
        number.test8();
        number.test9();

    }

    public void test1() {
        Number number = new Number();
        boolean result = number.isEven(2);
        if (result) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test2(){
        Number number = new Number();
        boolean result = number.isEven(3);
        if (!result){
            System.out.println("Test 2 = OK");
        }
        else {
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3() {
        Number number = new Number();
        boolean result = number.isOdd(2);
        if (!result) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }

    public void test4() {
        Number number = new Number();
        boolean result = number.isOdd(3);
        if (result) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }
// 2, 4 -> 3;
    public void test5() {
        Number number = new Number();
        int number1 = 2;
        int number2 = 4;
        double result = number.getMiddle(number1, number2);
        if (Math.abs(result - 3.0) < 0.0001) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }

    public void test6() {
        Number number = new Number();
        int number1 = 10;
        int number2 = 1;
        double result = number.getMiddle(number1, number2);
        if (Math.abs(result - 5.5) < 0.0001) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }

    // 1,2 -> 2;
    public void test7(){
        Number number =  new Number();
        int result = number.getMax(1, 2);
        if (result == 2){
            System.out.println("Test 7 = OK");
        }
        else{
            System.out.println("Test 7 = FAIL");
        }
    }
    // 7, 4 -> 7
    public void test8(){
        Number number =  new Number();
        int result = number.getMax(7, 4);
        if (result == 7){
            System.out.println("Test 8 = OK");
        }
        else{
            System.out.println("Test 8 = FAIL");
        }
    }
    //3, 3 -> 3
    public void test9(){
        Number number =  new Number();
        int result = number.getMax(3, 3);
        if (result == 3){
            System.out.println("Test 9 = OK");
        }
        else{
            System.out.println("Test 9 = FAIL");
        }
    }
}




package org.javaguru.student_evgenii_pashtaev.lesson_5.level_1;

public class Task1Test {

    public static void main(String[] args) {

        Task1Test number = new Task1Test();
        number.test1();
        number.test2();
        number.test3();

    }

    public void test1(){

        int numberInt = 10;
        Task1 number = new Task1();
        String result = number.devFive(numberInt);
        if (result.equals("Buzz")){
            System.out.println("Test 1 = OK");
        }
        else{
            System.out.println("Test 1 = FAIL");
        }
    }

    public void test2(){

        int numberInt = 9;
        Task1 number = new Task1();
        String result = number.devThree(numberInt);
        if (result.equals("Fizz")){
            System.out.println("Test 2 = OK");
        }
        else{
            System.out.println("Test 2 = FAIL");
        }
    }

    public void test3(){

        int numberInt = 15;
        Task1 number = new Task1();
        String result = number.devThreeFive(numberInt);
        if (result.equals("FizzBuzz")){
            System.out.println("Test 3 = OK");
        }
        else{
            System.out.println("Test 3 = FAIL");
        }
    }
}

package org.javaguru.student_evgenii_pashtaev.lesson_6.homework.level_1;

public class TriangleSquareTest {

    public static void main(String[] args) {

        TriangleSquareTest test = new TriangleSquareTest();
        test.triangleTest();
        test.trianglePerimeterTest();

    }

    public void triangleTest(){
        TriangleSquare triangle = new TriangleSquare();
        double area = triangle.calculateSquare(3, 3 ,3 );
        if(area > 3.8 && area < 3.9){
            System.out.println("OK");
        }
        else {
            System.out.println("FAIL");
        }

    }

    public void trianglePerimeterTest(){
        TriangleSquare triangle = new TriangleSquare();
        double perimeter = triangle.calculateSemiPerimeter(3,3,3);
        if (perimeter >= 4.5 && perimeter < 4.6){
            System.out.println("OK");
        }
        else{
            System.out.println("FAIL");
        }

    }
}

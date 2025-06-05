package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_5_plus;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void test1findMaxGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Bread", 750.00);
        products.add(product1);
        int expectedResult = 0;
        int actualResult = product1.findMaxGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test2findMaxGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Milk", 125.60);
        product1.addReview("Aleks", "Fine!", 4);
        product1.addReview("Aleks", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 5);
        product1.addReview("Aleks", "Bad!", 3);
        product1.addReview("Dmitrij", "Bad!", 2);
        product1.addReview("Dmitrij", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 4);
        products.add(product1);
        int expectedResult = 5;
        int actualResult = product1.findMaxGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test3findMaxGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product2 = new Product("Water", 50.00);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Dmitrij", "Fine!", 4);
        product2.addReview("Aleks", "Bad!", 3);
        product2.addReview("Dmitrij", "Bad!", 3);
        product2.addReview("Dmitrij", "Normal!", 4);
        product2.addReview("Dmitrij", "Normal!", 4);
        products.add(product2);
        int expectedResult = 4;
        int actualResult = product2.findMaxGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test4findMinGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Bread", 750.00);
        products.add(product1);
        int expectedResult = 0;
        int actualResult = product1.findMinGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test5findMinGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Milk", 125.60);
        product1.addReview("Aleks", "Fine!", 4);
        product1.addReview("Aleks", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 5);
        product1.addReview("Aleks", "Bad!", 3);
        product1.addReview("Dmitrij", "Bad!", 2);
        product1.addReview("Dmitrij", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 4);
        products.add(product1);
        int expectedResult = 2;
        int actualResult = product1.findMinGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test6findMinGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product2 = new Product("Water", 50.00);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Dmitrij", "Fine!", 4);
        product2.addReview("Aleks", "Bad!", 3);
        product2.addReview("Dmitrij", "Bad!", 3);
        product2.addReview("Dmitrij", "Normal!", 4);
        product2.addReview("Dmitrij", "Normal!", 4);
        products.add(product2);
        int expectedResult = 3;
        int actualResult = product2.findMinGradeOfReview();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test7findAverageGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Bread", 750.00);
        products.add(product1);
        double expectedResult = 0.0d;
        double actualResult = product1.findAverageGradeOfReview();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test8findAverageGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("Milk", 125.60);
        product1.addReview("Aleks", "Fine!", 4);
        product1.addReview("Aleks", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 5);
        product1.addReview("Aleks", "Bad!", 3);
        product1.addReview("Dmitrij", "Bad!", 2);
        product1.addReview("Dmitrij", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 4);
        products.add(product1);
        double expectedResult = 3.714285;
        double actualResult = product1.findAverageGradeOfReview();
        assertEquals(expectedResult, actualResult, 0.000001);
    }

    @Test
    void test9findAverageGradeOfReview() {
        List<Product> products = new ArrayList<>();
        Product product2 = new Product("Water", 50.00);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Dmitrij", "Fine!", 4);
        product2.addReview("Aleks", "Bad!", 3);
        product2.addReview("Dmitrij", "Bad!", 3);
        product2.addReview("Dmitrij", "Normal!", 4);
        product2.addReview("Dmitrij", "Normal!", 4);
        products.add(product2);
        double expectedResult = 3.714285;
        double actualResult = product2.findAverageGradeOfReview();
        assertEquals(expectedResult, actualResult, 0.000001);
    }
}
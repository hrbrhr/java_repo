package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_5_plus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProductReviewUI {

    public void runUI() {
        int numberOfProduct;
        List<Product> products = new ArrayList<>();
        String nick;
        String text;
        int grade;

        initialValues(products); // заполнение начальных значений

        while (true) {
            printMainMenu();
            int numberOfMainMenu = requestIntData("Enter a number of menu: ");
            if ((numberOfMainMenu < 1) || (numberOfMainMenu > 8)) {
                System.out.println("You enter incorrect number of menu!");
            }
            else if(numberOfMainMenu == 1) {
                // добавление нового товара;
                addNewProduct(products);
            }
            else if(numberOfMainMenu == 2) {
                // добавление нового отзыва;
                addNewReview(products);
            }
            else if(numberOfMainMenu == 3) {
                // Удаление отзыва
                removeReview(products);
            }
            else if(numberOfMainMenu == 4) {
                // возврат всех отзывов о конкретном товаре;
                printListOfProducts(products);
                numberOfProduct = requestIntData("Enter number of product: "); // Water
                printReviewsOfProduct(products, numberOfProduct);
            }
            else if(numberOfMainMenu == 5) {
                // нахождение наивысшей оценки о конкретном товаре;
                findMaxGradeOfReview(products);
            }
            else if(numberOfMainMenu == 6) {
                // нахождение наименьшей оценки о конкретном товаре;
                findMinGradeOfReview(products);
            }
            else if(numberOfMainMenu == 7) {
                // нахождение средней оценки о конкретном товаре
                findAverageGradeOfReview(products);
            }
            else {
                break;
            }
        }




    }

    private static void initialValues(List<Product> products) {
        Product product1 = new Product("Milk", 125.60);
        product1.addReview("Aleks", "Fine!", 4);
        product1.addReview("Aleks", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 5);
        product1.addReview("Aleks", "Bad!", 3);
        product1.addReview("Dmitrij", "Bad!", 2);
        product1.addReview("Dmitrij", "Normal!", 4);
        product1.addReview("Dmitrij", "Fine!", 4);
        products.add(product1);

        Product product2 = new Product("Water", 50.00);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Aleks", "Normal!", 4);
        product2.addReview("Dmitrij", "Fine!", 5);
        product2.addReview("Aleks", "Bad!", 3);
        product2.addReview("Dmitrij", "Bad!", 3);
        product2.addReview("Dmitrij", "Normal!", 4);
        product2.addReview("Dmitrij", "Normal!", 4);
        products.add(product2);
    }

    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("Main menu:");
        System.out.println("1. Add new product");
        System.out.println("2. Add new review");
        System.out.println("3. Remove review");
        System.out.println("4. Return all reviews");
        System.out.println("5. Find max grade of reviews");
        System.out.println("6. Find min grade of reviews");
        System.out.println("7. Find average grade of reviews");
        System.out.println("8. Exit");
    }

    private static void printListOfProducts(List<Product> products) {
        System.out.println("List of products: ");
        int i = 1;
        for(Product product: products) {
            String resultString = i + ". " + product.getName();
            System.out.println(resultString);
            i += 1;
        }
        System.out.println(" ");
    }

    private static void printReviewsOfProduct(List<Product> products, int numberOfProduct) {
        Product product = products.get(numberOfProduct - 1);
        product.showAllReviews();
        //System.out.println(" ");
    }

    private static int requestIntData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        int result = Integer.parseInt(scanner.nextLine());
        System.out.println(" ");
        return result;
    }

    private static double requestDoubleData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        double result = Double.parseDouble(scanner.nextLine());
        System.out.println(" ");
        return result;
    }

    private static String requestStringData(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title);
        String result = scanner.nextLine();
        return result;
    }

    private static void addNewProduct(List<Product> products) {
        String name = requestStringData("Enter name of product: "); // Bread
        double price = requestDoubleData("Enter price of product: "); // Not bad;
        Product product = new Product(name, price);
        products.add(product);
    }

    private static void addNewReview(List<Product> products) {
        printListOfProducts(products);
        int numberOfProduct = requestIntData("Enter number of product: "); // Water
        Product product = products.get(numberOfProduct - 1);

        String nick = requestStringData("Enter your nick: "); // Ivan
        String text = requestStringData("Enter text of review: "); // Not bad;
        int grade = requestIntData("Enter grade: "); // 4;
        product.addReview(nick, text, grade);
    }

    private static void removeReview(List<Product> products) {
        printListOfProducts(products);
        int numberOfProduct = requestIntData("Enter number of product: "); // Water
        printReviewsOfProduct(products, numberOfProduct);
        int numberOfReview = requestIntData("Enter number of review: ");

        Product product = products.get(numberOfProduct - 1);
        product.removeReview(numberOfReview - 1);
    }

    private static void findMaxGradeOfReview(List<Product> products) {
        printListOfProducts(products);
        int numberOfProduct = requestIntData("Enter number of product: ");
        Product product = products.get(numberOfProduct - 1);
        System.out.println("Product: " + product.getName() +
                           ", max grade: " + product.findMaxGradeOfReview());
    }

    private static void findMinGradeOfReview(List<Product> products) {
        printListOfProducts(products);
        int numberOfProduct = requestIntData("Enter number of product: ");
        Product product = products.get(numberOfProduct - 1);
        System.out.println("Product: " + product.getName() +
                ", min grade: " + product.findMinGradeOfReview());
    }

    private static void findAverageGradeOfReview(List<Product> products) {
        printListOfProducts(products);
        int numberOfProduct = requestIntData("Enter number of product: ");
        Product product = products.get(numberOfProduct - 1);
        System.out.println("Product: " + product.getName() +
                ", average grade: " + product.findAverageGradeOfReview());
    }


}

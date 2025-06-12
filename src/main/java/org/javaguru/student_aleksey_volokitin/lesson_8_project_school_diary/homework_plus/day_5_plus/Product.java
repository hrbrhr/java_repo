package org.javaguru.student_aleksey_volokitin.lesson_8_project_school_diary.homework_plus.day_5_plus;

import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;
    private List<Review> reviews;


    Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    String getName()   { return name; }
    double getPrice()  { return price; }

    void addReview(String nick, String text, int grade) {
        Review review = new Review(nick, text, grade);
        reviews.add(review);
    }
    void removeReview(int index) {
        reviews.remove(index);
    }
    void showAllReviews(){
        for (int i = 0; i < reviews.size(); i++) {
            Review review = reviews.get(i);
            int index = i + 1;
            System.out.println("Nick: " + review.getNick() +
                    ", text: " + review.getText() +
                    ", review " + index +
                    ": " + review.getGrade());
        }
    }
    int findMaxGradeOfReview(){
        int maxGrade = 0;
        for(Review review: reviews){
            if(review.getGrade() > maxGrade) {
                maxGrade = review.getGrade();
            }
        }
        return maxGrade;
    }
    int findMinGradeOfReview(){
        int minGrade = 10;
        for(Review review: reviews){
            if(review.getGrade() < minGrade) {
                minGrade = review.getGrade();
            }
        }
        if(minGrade > 5) {
            minGrade = 0;

        }
        return minGrade;
    }
    double findAverageGradeOfReview() {
        double sumOfGrades = 0.0d;
        int countOfGrades = 0;
        for(Review review: reviews){
            sumOfGrades += review.getGrade();
            countOfGrades += 1;
        }
        if(countOfGrades > 0) {
            return sumOfGrades / countOfGrades * 1.0d;
        }
        else {
            return 0.0d;
        }
    }

    void setName(String newName)     { this.name = newName; }
    void setPrice(double newPrice)   { this.price = newPrice; }

}

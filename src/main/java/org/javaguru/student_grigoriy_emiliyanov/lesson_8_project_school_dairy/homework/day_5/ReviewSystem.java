package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_5;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a review management system
 */
class ReviewSystem {
    private List<Review> reviews = new ArrayList<>();

    public void addReview(String author, String text, int mark) {
        reviews.add(new Review(author, text, mark));
    }

    public Review removeReview(int number) {
        return reviews.remove(number - 1);
    }

    public List<Review> getAllReviews() {
        return reviews;
    }

    public int findMax() {
        if (reviews.isEmpty()) return 0;
        return reviews.stream()
                .mapToInt(Review::getMark)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public int findMin() {
        if (reviews.isEmpty()) return 0;
        return reviews.stream()
                .mapToInt(Review::getMark)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    public double findAverage() {
        if (reviews.isEmpty()) return 0.0;
        return (double) reviews.stream().mapToInt(Review::getMark).sum() / reviews.size();
    }

    public boolean isValidMark(int mark) {
        return (mark >= 1) && (mark <=5);
    }
}

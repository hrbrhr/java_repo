package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a school diary with marks
 */
class SchoolDiary {
    private final List<Mark> marks = new ArrayList<>();

    /**
     * Returns all marks
     *
     * @return all marks
     */
    public List<Mark> getAllMarks() {
        return marks;
    }

    /**
     * Adds a given mark for given subject to this diary
     *
     * @param subject
     * @param mark
     */
    public void addMark(String subject, int mark) {
        marks.add(new Mark(subject, mark));
    }

    /**
     * Returns a list of all marks for given subject
     * @param subject
     * @return a list of all marks for given subject
     */
    private List<Mark> findMarksBySubject(String subject) {
        return marks.stream()
                .filter(mark -> mark.getSubject().equalsIgnoreCase(subject))
                .toList();
    }

    /**
     * Returns the max mark for given subject
     * @param subject
     * @return the max mark for given subject
     */
    public int findMax(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        if (subjectMarks.isEmpty()) return 0;
        return subjectMarks.stream()
                .mapToInt(Mark::getMark)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    /**
     * Returns the min mark for given subject
     * @param subject
     * @return the min mark for given subject
     */
    public int findMin(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        if (subjectMarks.isEmpty()) return 0;
        return subjectMarks.stream()
                .mapToInt(Mark::getMark)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

    /**
     * Returns the average mark for given subject
     * @param subject
     * @return the average mark for given subject
     */
    public double findAverageForSubject(String subject) {
        List<Mark> subjectMarks = findMarksBySubject(subject);
        if (subjectMarks.isEmpty()) return 0;
        return (double) subjectMarks.stream().mapToInt(Mark::getMark).sum() / subjectMarks.size();
    }

    /**
     * Returns the average of all marks any subject
     * @return the average of all marks any subject
     */
    public double findOverallAverage() {
        if (marks.isEmpty()) return 0;
        return (double) marks.stream().mapToInt(Mark::getMark).sum() / marks.size();
    }
}

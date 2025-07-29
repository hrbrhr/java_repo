package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_5;

/**
 * Represents user menu choices
 */
enum Choice {
    ADD(1),
    REMOVE(2),
    ALL(3),
    MAX(4),
    MIN(5),
    AVERAGE(6),
    EXIT(7),
    WRONG_CHOICE(99);

    private final int value;

    Choice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Choice getByValue(int value) {
        for (Choice choice : values())
            if (choice.getValue() == value) {
                return choice;
            }
        return WRONG_CHOICE;
    }
}

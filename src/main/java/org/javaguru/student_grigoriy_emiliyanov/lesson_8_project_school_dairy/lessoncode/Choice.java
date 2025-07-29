package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.lessoncode;

/**
 * Represents user menu choices
 */
enum Choice {
    ADD(1),
    MAX(2),
    MIN(3),
    AVERAGE(4),
    OVERALL_AVERAGE(5),
    ALL(6),
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

package org.javaguru.student_grigoriy_emiliyanov.lesson_9_inheritance.homework.day_2;

class ComputerPlayer extends Player {
    ComputerPlayer(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ComputerPlayer computerPlayer = new ComputerPlayer("AI");
        System.out.println(computerPlayer);
    }
}

package org.javaguru.student_grigoriy_emiliyanov.lesson_8_project_school_dairy.homework.day_1;

import java.util.List;

class ListGenericsDemo {
    public static void main(String[] args) {
        // Static checking error: Type argument cannot be a primitive type
//        List<int> listOfInt = new ArrayList<int>();
        List<Integer> integerList = List.of(1, 2, 3, 4);  // hidden boxing of primitive type
    }
}

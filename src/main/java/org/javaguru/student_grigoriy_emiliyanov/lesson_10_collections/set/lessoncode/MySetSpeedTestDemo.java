package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.set.lessoncode;

public class MySetSpeedTestDemo {
    static final int SPACE = 200_000;
    public static void main(String[] args) {
        MySetWithList<String> mySetWithList = new MySetWithList<>();
        MySetWithHashSet<String> mySetWithHashSet = new MySetWithHashSet<>();

//        - add()
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SPACE; i++) {
            mySetWithList.add(String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Add to SetWithList: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SPACE; i++) {
            mySetWithHashSet.add(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Add to SetWithHashSet: " + (endTime - startTime));
//        - size()
        startTime = System.currentTimeMillis();
        mySetWithList.size();
        endTime = System.currentTimeMillis();
        System.out.println("Size to SetWithList: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        mySetWithHashSet.size();
        endTime = System.currentTimeMillis();
        System.out.println("Size to SetWithHashSet: " + (endTime - startTime));
//        - remove(element)
        startTime = System.currentTimeMillis();
        mySetWithList.remove(String.valueOf(SPACE/ 2));
        endTime = System.currentTimeMillis();
        System.out.println("Remove to SetWithList in microsec: " + (endTime - startTime) * 1000);
        startTime = System.currentTimeMillis();
        mySetWithHashSet.remove(String.valueOf(SPACE/ 2));
        endTime = System.currentTimeMillis();
        System.out.println("Remove to SetWithHashSet in microsec: " + (endTime - startTime) * 1000);
//                - contains(element)
        startTime = System.currentTimeMillis();
        mySetWithList.contains(String.valueOf(SPACE/ 2));
        endTime = System.currentTimeMillis();
        System.out.println("Contains to SetWithList in microsec: " + (endTime - startTime) * 1000);
        startTime = System.currentTimeMillis();
        mySetWithHashSet.contains(String.valueOf(SPACE/ 2));
        endTime = System.currentTimeMillis();
        System.out.println("Contains to SetWithHashSet in microsec: " + (endTime - startTime) * 1000);
    }
}

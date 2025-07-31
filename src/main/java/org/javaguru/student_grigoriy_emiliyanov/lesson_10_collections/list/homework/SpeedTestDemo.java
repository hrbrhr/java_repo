package org.javaguru.student_grigoriy_emiliyanov.lesson_10_collections.list.homework;

public class SpeedTestDemo {
    public static void main(String[] args) {
        ScrabbleArray scrabbleArray = new ScrabbleArray();
        ScrabbleLinkedList scrabbleLinkedList = new ScrabbleLinkedList();
        final int SPACE = 10_000_000;
//       -add()
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SPACE; i++) {
            scrabbleArray.add(String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Add to Array: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < SPACE; i++) {
            scrabbleLinkedList.add(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Add to LinkedList: " + (endTime - startTime));

//       - size()
        startTime = System.currentTimeMillis();
        scrabbleArray.size();
        endTime = System.currentTimeMillis();
        System.out.println("Size of Array: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        scrabbleLinkedList.size();
        endTime = System.currentTimeMillis();
        System.out.println("Size of linked list: " + (endTime - startTime));

//       - get( int index)
        startTime = System.currentTimeMillis();
        scrabbleArray.get(SPACE / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Get of Array: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        scrabbleLinkedList.get(SPACE / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Get of linked list: " + (endTime - startTime));

//       -remove( int index)
        startTime = System.currentTimeMillis();
        scrabbleArray.remove(SPACE / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Remove of Array: " + (endTime - startTime));
        startTime = System.currentTimeMillis();
        scrabbleLinkedList.remove(SPACE / 2);
        endTime = System.currentTimeMillis();
        System.out.println("Remove of linked list: " + (endTime - startTime));
    }
}

package org.javaguru.student_anastassija.lesson_12.lessoncode;

class ArrayException extends Exception {

    private  int arrayIndex;
    private  int arraySize;
    private  String errorMessage;

    public  ArrayException(int arrayIndex,int arraySize, String errorMessage){}
}

package org.javaguru.student_aleksey_volokitin.lesson_12_exceptions.lessoncode;

class ArrayException extends Exception {
    private int arrayIndex;
    private int arraySize;
    private String errorMessage;

    public ArrayException(int arrayIndex, int arraySize, String errorMessage) {
        this.arrayIndex = arrayIndex;
        this.arraySize = arraySize;
        this.errorMessage = errorMessage;
    }
    public int getArrayIndex() {
        return arrayIndex;
    }

    public int getArraySize() {
        return arraySize;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}

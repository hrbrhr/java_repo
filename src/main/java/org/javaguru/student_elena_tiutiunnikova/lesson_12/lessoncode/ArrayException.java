package org.javaguru.student_elena_tiutiunnikova.lesson_12.lessoncode;

class ArrayException extends RuntimeException {

    private int arrayIndex;
    private int arraySize;
    private String errorMessage;

    public ArrayException(int arrayIndex,
                          int arraySize,
                          String errorMessage) {
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

package org.javaguru.student_vitalii_lutsenko.lesson_12;

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

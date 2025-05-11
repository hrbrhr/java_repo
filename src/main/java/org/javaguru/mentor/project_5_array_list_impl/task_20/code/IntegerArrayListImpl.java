package org.javaguru.mentor.project_5_array_list_impl.task_20.code;

class IntegerArrayListImpl implements IntegerArrayList {

    private int[] internalArray;

    public IntegerArrayListImpl() {
        this.internalArray = new int[0];
    }

    public int size() {
        return this.internalArray.length;
    }

    public boolean isEmpty() {
        return this.internalArray.length == 0;
    }

    @Override
    public void add(int newElement) {
        int[] newArray = new int[this.internalArray.length + 1];
        for (int i = 0; i < this.internalArray.length; i++) {
            newArray[i] = this.internalArray[i];
        }
        newArray[newArray.length - 1] = newElement;
        this.internalArray = newArray;
    }

    @Override
    public void remove(int elementIndex) {
        if (elementIndex < 0) {
            throw new ArrayIndexOutOfBoundsException(elementIndex);
        }
        if (elementIndex >= this.internalArray.length) {
            throw new ArrayIndexOutOfBoundsException(elementIndex);
        }

        int[] newArray = new int[this.internalArray.length - 1];
        int i = 0;
        for (int j = 0; j < this.internalArray.length; j++) {
            if (j != elementIndex) {
                newArray[i] = this.internalArray[j];
                i++;
            }
        }

        this.internalArray = newArray;
    }

    @Override
    public int get(int elementIndex) {
        return this.internalArray[elementIndex];
    }

}

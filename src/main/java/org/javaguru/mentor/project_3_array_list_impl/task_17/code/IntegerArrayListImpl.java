package org.javaguru.mentor.project_3_array_list_impl.task_17.code;

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
        // WILL BE implemented late
    }

    @Override
    public int get(int elementIndex) {
        // WILL BE implemented late
        return 0;
    }

}

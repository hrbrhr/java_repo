package org.javaguru.mentor.project_3_array_list_impl.task_15.code;

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
        // WILL BE implemented late
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

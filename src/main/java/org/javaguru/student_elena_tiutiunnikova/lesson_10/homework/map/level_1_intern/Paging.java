package org.javaguru.student_elena_tiutiunnikova.lesson_10.homework.map.level_1_intern;

class Paging {

    private int pageNumber;
    private int pageSize;

    public Paging(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }
}

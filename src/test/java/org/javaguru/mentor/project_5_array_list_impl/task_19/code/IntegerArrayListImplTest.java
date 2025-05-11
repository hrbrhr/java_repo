package org.javaguru.mentor.project_5_array_list_impl.task_19.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerArrayListImplTest {

    @Test
    public void sizeOfListShouldBeZeroAfterCreation() {
        IntegerArrayList list = new IntegerArrayListImpl();
        assertEquals(list.size(), 0);
    }

    @Test
    public void listShouldBeEmptyAfterCreation() {
        IntegerArrayList list = new IntegerArrayListImpl();
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldListSizeBeZeroAndEmptyTrue() {
        IntegerArrayList list = new IntegerArrayListImpl();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
    }

    @Test
    public void addOneElementSizeShouldBeOne() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        assertEquals(list.size(), 1);
    }

    @Test
    public void addTwoDifferentElementsSizeShouldBeTwo() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.size(), 2);
    }

    @Test
    public void addTwoEqualsElementsSizeShouldBeTwo() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        list.add(1);
        assertEquals(list.size(), 2);
    }

    @Test
    public void shouldBeNotEmptyWhenAddOneElement() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldGetElementFromZeroIndex() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        assertEquals(list.get(0), 1);
    }

    @Test
    public void shouldGetElementFromLastIndex() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldGetElementFromMiddleIndex() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldThrowExceptionWhenIndexBelowZero() {
        IntegerArrayList list = new IntegerArrayListImpl();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexEqualsListSize() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexAboveListSize() {
        IntegerArrayList list = new IntegerArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(2));
    }

}
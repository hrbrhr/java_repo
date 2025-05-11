package org.javaguru.mentor.project_5_array_list_impl.task_21.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerArrayListImplTest {

    @Test
    public void sizeOfListShouldBeZeroAfterCreation() {
        ObjectArrayList list = new ObjectArrayListImpl();
        assertEquals(list.size(), 0);
    }

    @Test
    public void listShouldBeEmptyAfterCreation() {
        ObjectArrayList list = new ObjectArrayListImpl();
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldListSizeBeZeroAndEmptyTrue() {
        ObjectArrayList list = new ObjectArrayListImpl();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
    }

    @Test
    public void addOneElementSizeShouldBeOne() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertEquals(list.size(), 1);
    }

    @Test
    public void addTwoDifferentElementsSizeShouldBeTwo() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.size(), 2);
    }

    @Test
    public void addTwoEqualsElementsSizeShouldBeTwo() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(1);
        assertEquals(list.size(), 2);
    }

    @Test
    public void shouldBeNotEmptyWhenAddOneElement() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldGetElementFromZeroIndex() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertEquals(list.get(0), 1);
    }

    @Test
    public void shouldGetElementFromLastIndex() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldGetElementFromMiddleIndex() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldThrowExceptionWhenIndexBelowZero() {
        ObjectArrayList list = new ObjectArrayListImpl();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexEqualsListSize() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexAboveListSize() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexBelowZero() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexEqualsListSize() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexEqualsListSizeZero() {
        ObjectArrayList list = new ObjectArrayListImpl();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexAboveListSize() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(2));
    }

    @Test
    public void removeShouldReduceListSizeByOne() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertEquals(list.size(), 1);
        list.remove(0);
        assertEquals(list.size(), 0);
    }

    @Test
    public void removeShouldReduceListSizeByOneIsEmpty() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldRemoveFromIndexZero() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.get(0), 1);
        list.remove(0);
        assertEquals(list.get(0), 2);
    }

    @Test
    public void shouldRemoveFromLastIndex() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        assertEquals(list.get(1), 2);
        list.remove(1);
        assertEquals(list.get(0), 1);
    }

    @Test
    public void shouldRemoveFromMiddleIndex() {
        ObjectArrayList list = new ObjectArrayListImpl();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(1), 2);
        list.remove(1);
        assertEquals(list.get(1), 3);
    }

}
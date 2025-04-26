package org.javaguru.mentor.project_3_array_list_impl.task_22.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ObjectArrayListImplTest {

    @Test
    public void sizeOfListShouldBeZeroAfterCreation() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        assertEquals(list.size(), 0);
    }

    @Test
    public void listShouldBeEmptyAfterCreation() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldListSizeBeZeroAndEmptyTrue() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        assertTrue(list.isEmpty());
        assertEquals(list.size(), 0);
    }

    @Test
    public void addOneElementSizeShouldBeOne() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertEquals(list.size(), 1);
    }

    @Test
    public void addTwoDifferentElementsSizeShouldBeTwo() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        assertEquals(list.size(), 2);
    }

    @Test
    public void addTwoEqualsElementsSizeShouldBeTwo() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(1);
        assertEquals(list.size(), 2);
    }

    @Test
    public void shouldBeNotEmptyWhenAddOneElement() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldGetElementFromZeroIndex() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertEquals(list.get(0), 1);
    }

    @Test
    public void shouldGetElementFromLastIndex() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldGetElementFromMiddleIndex() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(1), 2);
    }

    @Test
    public void shouldThrowExceptionWhenIndexBelowZero() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(-1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexEqualsListSize() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(1));
    }

    @Test
    public void shouldThrowExceptionWhenIndexAboveListSize() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.get(2));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexBelowZero() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(-1));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexEqualsListSize() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(1));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexEqualsListSizeZero() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(0));
    }

    @Test
    public void removeShouldThrowExceptionWhenIndexAboveListSize() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> list.remove(2));
    }

    @Test
    public void removeShouldReduceListSizeByOne() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertEquals(list.size(), 1);
        list.remove(0);
        assertEquals(list.size(), 0);
    }

    @Test
    public void removeShouldReduceListSizeByOneIsEmpty() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldRemoveFromIndexZero() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        assertEquals(list.get(0), 1);
        list.remove(0);
        assertEquals(list.get(0), 2);
    }

    @Test
    public void shouldRemoveFromLastIndex() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        assertEquals(list.get(1), 2);
        list.remove(1);
        assertEquals(list.get(0), 1);
    }

    @Test
    public void shouldRemoveFromMiddleIndex() {
        ObjectArrayList<Integer> list = new ObjectArrayListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list.get(1), 2);
        list.remove(1);
        assertEquals(list.get(1), 3);
    }

}
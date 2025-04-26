package org.javaguru.mentor.project_3_array_list_impl.task_16.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

}
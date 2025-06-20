package org.javaguru.mentor.project_5_apple_warehouse.task_2.applewarehouse;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppleWarehouseTest {

    @Test
    public void shouldFindGreenApples() {
        AppleWarehouse warehouse = new AppleWarehouse();
        List<Apple> greenApples = warehouse.findGreenApples();
        assertEquals(greenApples.size(), 3);
    }

}
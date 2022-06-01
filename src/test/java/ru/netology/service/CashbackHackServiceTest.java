package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testRemainBoundaryValuesOne() {
        org.junit.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.Test
    public void testRemainBoundaryValuesTwo() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesThree() {
        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFour() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFive() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesSix() {
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void testRemainCriticalPath() {
        org.junit.Assert.assertEquals(600, service.remain(400));
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesOneWithJupiter() {
        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesTwoWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesThreeWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1));
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesFourWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesFiveWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void testRemainBoundaryValuesSixWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    public void testRemainCriticalPathWithJupiter() {
        org.junit.jupiter.api.Assertions.assertEquals(600, service.remain(400));
    }
}
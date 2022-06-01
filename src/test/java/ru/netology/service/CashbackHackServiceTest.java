package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesOne() {
        org.testng.Assert.assertThrows(RuntimeException.class, () -> {
            service.remain(-1);
        });
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesTwo() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesThree() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesFour() {
        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesFive() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void testRemainBoundaryValuesSix() {
        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void testRemainCriticalPath() {
        org.testng.Assert.assertEquals(service.remain(400), 600);
    }
}
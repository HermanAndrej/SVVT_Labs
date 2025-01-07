package LabExamPracticeTask1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MonitorTest {
    Monitor basicMonitor = new Monitor("Samsung", 21, 200.00, 2022, 50);

    @Test
    @Order(1)
    public void testMonitor() {
        assertThrows(IllegalArgumentException.class, () -> new Monitor("Samsung", 21, -2.00, 2022, 50));
    }

    @Test
    @Order(2)
    public void testMonitor2() {
        assertDoesNotThrow(() -> new Monitor("Samsung", 21, 2.00, 2022, 50));
    }

    @Test
    @Order(3)
    public void testMonitor3() {
        assertDoesNotThrow(() -> new Monitor("Samsung", 21, 5.00, 2022, 50));
    }

    @Test
    @Order(4)
    public void testGetYearOfManufacturing() {
        Monitor basicMonitor = new Monitor("Samsung", 21, 200.00, 2022, 50);
        assertTrue(basicMonitor.getYearOfManufacturing() == 2022);
    }

    @Test
    @Order(5)
    public void testGetYearOfManufacturing2() {
        Monitor basicMonitor = new Monitor("Samsung", 21, 200.00, 2022, 50);
        assertFalse(basicMonitor.getYearOfManufacturing() != 2022);
    }

    @Test
    @Order(6)
    public void testCalculateDiscountedPriceSuccess() {
        Monitor olderMonitor = new Monitor("Samsung", 21, 200.00, 2015, 50);
        Double discountedPrice = olderMonitor.calculateDiscountedPrice();
        assertEquals(olderMonitor.getPrice()*0.8, discountedPrice);
    }

    @Test
    @Order(7)
    public void testCalculateDiscountedPriceFailure() {
        Monitor olderMonitor = new Monitor("Samsung", 21, 200.00, 2023, 50);
        Double discountedPrice = olderMonitor.calculateDiscountedPrice();
        assertNotEquals(olderMonitor.getPrice()*0.8, discountedPrice);
    }

    @Test
    @Order(8)
    public void testIsPremiumSuccess() {
        Monitor premiumMonitor = new Monitor("Dell", 27, 500.00, 2023, 120);
        assertTrue(premiumMonitor.isPremium());
    }

    @Test
    @Order(9)
    public void testIsPremiumFailure() {
        assertFalse(basicMonitor.isPremium());
    }

    @Test
    @Order(10)
    public void testIs4KSuccess() {
        Monitor premiumMonitor = new Monitor("Dell", 32, 500.00, 2023, 60);
        assertTrue(premiumMonitor.is4K());
    }

    @Test
    @Order(11)
    public void testIs4KFailure() {
        assertFalse(basicMonitor.is4K());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/monitors.csv", numLinesToSkip = 1)
    public void testMonitors(String manufacturer, int screenSize, Double price, int yearOfManufacturing, int refreshRate) {
        Monitor monitor = new Monitor(manufacturer, screenSize, price, yearOfManufacturing, refreshRate);
        assertTrue(monitor.isPremium());
    }
}
package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    void amountSalesIsEqual() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.getSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void averageAmountSalesIsEquals() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        long actualSum = service.getAverageSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void findMonthMaxAmountSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMaxAmountMonthSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void findMonthMinAmountSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.getMinAmountMonthSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void findCountMonthBelowAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.getCountMonthBelowAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    void findCountMonthAboveAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.getCountMonthAboveAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}

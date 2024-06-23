package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    void AmountSalesIsEqual() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 180;
        long actualSum = service.GetSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void AverageAmountSalesIsEquals() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = 15;
        long actualSum = service.GetAverageSumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void FindMonthMaxAmountSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.GetMaxAmountMonthSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void FindMonthMinAmountSales() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.GetMinAmountMonthSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    void FindCountMonthBelowAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.GetCountMonthBelowAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    void FindCountMonthAboveAverage() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedCount = 5;
        int actualCount = service.GetCountMonthAboveAverage(sales);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}

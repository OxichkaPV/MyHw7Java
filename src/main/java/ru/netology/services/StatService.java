package ru.netology.services;

public class StatService {
    public long GetSumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long GetAverageSumSales(long[] sales) {
        return GetSumSales(sales) / sales.length;
    }

    public int GetMaxAmountMonthSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int GetMinAmountMonthSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int GetCountMonthBelowAverage(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale < GetAverageSumSales(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int GetCountMonthAboveAverage(long[] sales) {
        int countMonth = 0;
        for (long sale : sales) {
            if (sale > GetAverageSumSales(sales)) {
                countMonth++;
            }
        }
        return countMonth;
    }
}

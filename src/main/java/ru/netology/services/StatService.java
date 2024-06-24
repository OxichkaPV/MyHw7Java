package ru.netology.services;

public class StatService {
    public long getSumSales(long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    public long getAverageSumSales(long[] sales) {
        return getSumSales(sales) / sales.length;
    }

    public int getMaxAmountMonthSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int getMinAmountMonthSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int getCountMonthBelowAverage(long[] sales) {
        int countMonth = 0;
        long averageSum = getAverageSumSales(sales);
        for (long sale : sales) {
            if (sale < averageSum) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int getCountMonthAboveAverage(long[] sales) {
        int countMonth = 0;
        long averageSum = getAverageSumSales(sales);
        for (long sale : sales) {
            if (sale > averageSum) {
                countMonth++;
            }
        }
        return countMonth;
    }
}

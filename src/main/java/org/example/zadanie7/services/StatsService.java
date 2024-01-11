package org.example.zadanie7.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageSumSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int averageMinSales(long[] sales) {
        long averageSum = averageSumSales(sales);
        int minMonth = 0;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] < averageSum) minMonth++;
        }
        return minMonth;
    }

    public int averageMaxSales(long[] sales) {
        long averageSum = averageSumSales(sales);
        int maxMonth = 0;
        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > averageSum) maxMonth++;
        }
        return maxMonth;
    }


}

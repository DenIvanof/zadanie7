package org.example.zadanie7.services;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = i; // запомним его как минимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];

        }
        return sum / sales.length;
    }

    public int averageMinSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageSum = sum / sales.length;
        }
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int j = 0; j < sales.length; j++) {
            if (sales[j] < averageSum) minMonth++;  // значит, в рассматриваемом i-м месяце продаж меньше
                 // запомним его как минимальный

        }

        return minMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    public int averageMaxSales(int[] sales) {
        int sum = 0;
        int averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            averageSum = sum / sales.length;
        }
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int j = 0; j < sales.length; j++) {
            if (sales[j] > averageSum) maxMonth++;  // значит, в рассматриваемом i-м месяце продаж меньше
            // запомним его как минимальный

        }

        return maxMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


}

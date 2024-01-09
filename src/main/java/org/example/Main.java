package org.example;

import org.example.zadanie7.services.StatsService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println("Данные о продажах предприятия по месяцам:");
        System.out.println(Arrays.toString(sales));
        System.out.println("Cумма всех продаж");
        System.out.println(service.sumSales(sales));
        System.out.println("Средняя сумма всех продаж в месяц");
        System.out.println(service.averageSumSales(sales));
        System.out.println("Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму");
        System.out.println(service.maxSales(sales));
        System.out.println("Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму");
        System.out.println(service.minSales(sales));
        System.out.println("Количество месяцев, в которых продажи были ниже среднего");
        System.out.println(service.averageMinSales(sales));
        System.out.println("Количество месяцев, в которых продажи были выше среднего");
        System.out.println(service.averageMaxSales(sales));


    }
}
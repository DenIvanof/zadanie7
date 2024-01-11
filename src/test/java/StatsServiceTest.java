import org.example.zadanie7.services.StatsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void allSales() { //сумма
        StatsService service = new StatsService();
        int expected = 180;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesAmount() { //средняя сумма
        StatsService service = new StatsService();
        int expected = 15;
        long actual = service.averageSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMaxSales() { //№макс
        StatsService service = new StatsService();
        int expected = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMinSales() { //№мин
        StatsService service = new StatsService();
        int expected = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageMinSalesAmount() { //ниже среднего
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.averageMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageMaxSalesAmount() { //выше среднего
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.averageMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}

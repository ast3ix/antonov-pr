package stocks;

public class TestStock {
    public static void main(String[] args) {
        Stock new_stock = new Stock("SBER", "ПАЩ Сбербанк", 281.5, 282.87);
        System.out.println("% изменения стоимости акций = " + new_stock.getChangePercent());
    }
}

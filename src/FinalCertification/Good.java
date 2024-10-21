package FinalCertification;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Good {
    // Пишем поля класса, общие для всех товаров.
    private int productCode;
    private String productName;
    private String productColor;
    private String manufactureCountry;
    private double price;

    // Создаем конструктор.
    public Good(int productCode, String productName, String productColor, String manufactureCountry, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.productColor = productColor;
        this.manufactureCountry = manufactureCountry;
        this.price = price;
    }

    public String getGoodCategory(){
        return getClass().getSimpleName();
    }

    // Данный метод нужен для того, чтобы реализовать метод возврата цвета товара в классе Laptop.
    public String getProductColor(){
        return productColor;
    }

    // Переопределяем стандартные методы.
    @Override
    public String toString() {
        // Умышленно указал не все поля вывода для читабельности выводимой информации.
        return getGoodCategory() + " {" +
                "код товара:" + productCode +
                ", наименование:'" + productName + '\'' +
                ", цвет:'" + productColor + '\'' +
                ", цена:'" + price + " рублей " + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return productCode == good.productCode && Objects.equals(productName, good.productName) && Objects.equals(productColor, good.productColor) && Objects.equals(manufactureCountry, good.manufactureCountry) && Objects.equals(price, good.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, productName, productColor, manufactureCountry, price);
    }
}

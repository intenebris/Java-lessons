package FinalCertification;

import java.math.BigDecimal;

public class Laptop extends Good {
    // Пишем поля класса, необходимые лишь для данной категории товаров.
    private int ram;
    private int hdd;
    private String os;

    // Создаем конструктор экземпляра класса.
    public Laptop(int productCode, String productName, String productColor, String manufactureCountry, int ram,int hdd, String os, double price) {
        super(productCode, productName, productColor, manufactureCountry, price);
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
    }

    // Ниже описаны методы, необходимые для реализации фильтрации товаров в классе SelectionFilter.
    public int getRam(){
        return ram;
    }
    public int getHdd(){
        return hdd;
    }
    public String getOs(){
        return os;
    }
    public String getColor(){
        return getProductColor();
    }
}

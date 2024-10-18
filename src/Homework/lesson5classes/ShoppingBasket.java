package Homework.lesson5classes;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private static Map<String, Integer> basket = new HashMap<>();

    public static void addProduct(String product, Integer quantity){
        int tempQuantity = 0;
        if (basket.containsKey(product)){
            tempQuantity = basket.get(product);
            basket.put(product, tempQuantity+quantity);
        } else {
            basket.put(product, quantity);
        }
    }

    public static void removeProduct(String product){
        if (basket.containsKey(product)){
            basket.remove(product);
        }
    }

    public static void updateQuantity(String product, Integer quantity){
        if (basket.containsKey(product)){
            basket.put(product, quantity);
        }
    }

    public static int checkProduct(String product){
        int result;
        if (basket.containsKey(product)){
            result = basket.get(product);
        } else {
            result = 0;
        }
        return result;
    }

    public static void showBasket(){
        System.out.println(basket.entrySet());
    }
}

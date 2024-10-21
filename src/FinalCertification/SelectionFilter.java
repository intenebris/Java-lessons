package FinalCertification;

import java.util.Map;
import java.util.Set;

public class SelectionFilter{
    //  Метод производит подбор товара на основе критериев пользователя.
    public static void filterLaptops(Set<Laptop> laptops, Map<String, Object> somemap) {
        for (Laptop laptop : laptops){
            boolean matches = true;
            if (somemap.containsKey("ram") && laptop.getRam() < (int) somemap.get("ram")){
                matches = false;
            }
            if (somemap.containsKey("hdd") && laptop.getHdd() < (int) somemap.get("hdd")){
                matches = false;
            }
            if (somemap.containsKey("os") && !laptop.getOs().equalsIgnoreCase((String) somemap.get("os"))){
                matches = false;
            }
            if (somemap.containsKey("productColor") && !laptop.getColor().equalsIgnoreCase((String) somemap.get("productColor"))){
                matches = false;
            }
            if (matches){
                System.out.println("Вам подойдет "+laptop);
            }
        }
    }
}

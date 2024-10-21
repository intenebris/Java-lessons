package FinalCertification;

import java.util.*;

/**
 * Задание 1. Поиск ноутбуков.
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * -Создать множество ноутбуков.
 * -Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 * Критерии фильтрации можно хранить в Map.
 **/

public class LaptopStore {
    public static void main(String[] args) {

        // Создаем множество (список) ноутбуков.
        Set<Laptop> listOfGoods = new HashSet<>();
        listOfGoods.add(new Laptop(632005, "Lenovo Essential", "black", "China", 8, 256, "Windows 10", 68500.00));
        listOfGoods.add(new Laptop(406451, "HP ProBook", "gray", "USA", 8, 512, "Windows 11", 73000.00));
        listOfGoods.add(new Laptop(823501, "Dell Inspiron", "black", "USA", 4, 128, "Ubuntu", 52400.00));
        listOfGoods.add(new Laptop(778349, "Apple MacBook Pro", "white", "USA", 16, 256, "macOS", 268900.00));

        // Выводим множество в консоль для демонстрации полученного результата. Необязательный пункт задачи (для себя и преподавателя).
        System.out.println(listOfGoods);

        // Создаем множество (список) сопутствующих товаров.
        Set<RelatedProducts> relatedProducts = new HashSet<>();
        relatedProducts.add(new RelatedProducts(223342, "Optical mouse OM320", "yellow", "China", "мышка для ноутбуков и ПК", 300.00));
        relatedProducts.add(new RelatedProducts(205725, "MousePad Steel-X", "silver", "China", "коврик для мышки", 200.00));
        relatedProducts.add(new RelatedProducts(242517, "Smartbuy Keyboard", "white", "China", "клавиатура игровая", 1100.00));

        System.out.println(relatedProducts);

        // Создаем список критериев для подбора товара.
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ОЗУ");
        criteria.put(2, "Объем ЖД");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Цвет");

        // Инициализируем Map, куда в дальнейшем будем добавлять значения фильтров, полученные от пользователя.
        Map<String, Object> filters = new HashMap<>();

        // Создаем цикл, в котором будем принимать данные от пользователя.
        Scanner scanner = new Scanner(System.in);
        boolean continueFiltering = true;
        while (continueFiltering) {
            System.out.println("Выберите необходимому критерию: ");
            for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
            System.out.print("Введите цифру, соответствующую Вашему выбору: ");
            int criterion = scanner.nextInt();
            scanner.nextLine();

            switch (criterion) {
                case 1:
                    System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                    filters.put("ram", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("Введите минимальное значение объема жесткого диска (в ГБ): ");
                    filters.put("hdd", scanner.nextInt());
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("Введите операционную систему: ");
                    filters.put("os", scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Введите цвет устройства: ");
                    filters.put("productColor", scanner.nextLine());
                    break;
                default:
                    System.out.print("Вы ввели некорректное значение.");
            }
            System.out.print("Хотите добавить еще один критерий? (да/нет): ");
            String response = scanner.nextLine();
            continueFiltering = response.equalsIgnoreCase("да");
        }

        // Получаем результаты подбора товара для пользователя с выводом их в консоль.
        SelectionFilter.filterLaptops(listOfGoods, filters);

        /** Спасибо Вам за интересные семинары! Информация воспринималась комфортно.
         * Жаль не удалось ни разу побывать на онлайн занятии.
         **/

    }

}

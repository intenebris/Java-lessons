package Homework;

import java.io.FileWriter;
import java.io.IOException;

public class homework_lesson2 {
    public static void main(String[] args) throws IOException {
        //Задание1. Формирование URL с параметрами
        String link = "https://example.com/search";
        String params = "query=java&sort=desc&filter=null";
        System.out.println(formURLwithParam(link, params));

        //Задача2. Создание CSV-строки из массива объектов
        String[] headers = {"Name","Age","City"};
        String[][] data ={ {"John","30","NewYork"}, {"Alice","25","LosAngeles"},{"Bob","35","Chicago"} };
        generateCSV(headers, data);
    }

    //Задание1. Формирование URL с параметрами
    public static String formURLwithParam(String link, String params){
        StringBuilder url = new StringBuilder(link);
        if (!link.contains("?")){
            url.append("?");
        }
        String[] parametrics = params.split("&");
        String[] keysAndValues = null;
        for (int i = 0; i < parametrics.length; i++) {
            keysAndValues = parametrics[i].split("=");
            if(!"null".equals(keysAndValues[1])){
                url.append(keysAndValues[0]+"="+keysAndValues[1]+"&");
            }
        }
        url.deleteCharAt(url.length()-1);
        return url.toString();
    }

    //Задача2. Создание CSV-строки из массива объектов
    public static void generateCSV(String[] headers, String[][] values) throws IOException {
        FileWriter fw = new FileWriter("base.csv");
        StringBuilder sb = new StringBuilder(String.join(",", headers));
        sb.append("\n");
        for (String[] value : values){
            sb.append(String.join(",", value) + "\n");
        }
        fw.write(sb.toString().trim());
        fw.flush();
        fw.close();
    }
}

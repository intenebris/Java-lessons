package lesson2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        String path = "./src/lesson1";
        String fileName = "list.txt";
        writeFileListToFile(path, fileName);
    }

    private static String[] getListOfFiles(String path){
        File file = new File(path);
        if (file.isFile()){
            return new String[0];
        }
        File[] files = file.listFiles();
        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++) {
            names[i] = files[i].getName();
        }
        return names;
    }

   public static void writeFileListToFile(String out, String in){
        String[] names = getListOfFiles(out);
       FileWriter fw = null;
        try {
           fw = new FileWriter(in);
           for (String name : names){
               fw.write(name + "\n");
           }
           fw.flush();
       } catch (IOException e) {
           throw new RuntimeException("Извините, запись в файл не удалась.");
       } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

   }
}

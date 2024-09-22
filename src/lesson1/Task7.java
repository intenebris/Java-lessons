package lesson1;

import java.io.FileWriter;
import java.io.IOException;

public class Task7 {
    public static void main(String[] args) throws IOException {
        write_to_file();
    }
    public static void write_to_file() throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write("Hello world!");
        fw.flush();
        fw.close();
    }
}



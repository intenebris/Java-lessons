package lesson1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(revers_string());
    }
    public static String revers_string(){
        String s = "Добро пожаловать на курс по Java";
        String[] arr = s.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i] + " ";
        }
        return result;
    }
}

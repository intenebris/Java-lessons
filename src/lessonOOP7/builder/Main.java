package lessonOOP7.builder;

public class Main {
    public static void main(String[] args) {
        BigCard bigCardBuilder = new BigCard();
        System.out.println(bigCardBuilder.setColorFront("red").setColoBack("black").build());


        SmallCard smallCardBuilder = new SmallCard();
        System.out.println(smallCardBuilder.setColorFront("green").setColoBack("white").build());

    }
}

package lessonOOP7.builder;

public class SmallCard extends CardBuilder{
    @Override
    public void createName() {
        getCard().setName("Small card");
    }

    @Override
    public void createPrice() {
        getCard().setPrice(100);
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[]{8, 10});
    }
}

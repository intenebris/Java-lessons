package lessonOOP7.builder;

public class BigCard extends CardBuilder {
    @Override
    public void createName() {
        getCard().setName("Big card");
    }

    @Override
    public void createPrice() {
        getCard().setPrice(1000);
    }

    @Override
    public void createSize() {
        getCard().setSize(new int[]{10, 12});
    }


}

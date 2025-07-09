public class Pizza implements MenuItem{
    private  float price=166.99F;
    @Override
    public String getName() {
        return "Pizza";
    }

    @Override
    public float getPrice() {
        return price;
    }
}

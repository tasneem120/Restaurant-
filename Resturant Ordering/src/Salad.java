public class Salad implements MenuItem{
    private float price=20.25F;
    @Override
    public String getName() {
        return "Salad";
    }

    @Override
    public float getPrice() {
        return price;
    }
}

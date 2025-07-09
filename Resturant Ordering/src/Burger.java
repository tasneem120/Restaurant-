public class Burger implements MenuItem{
    private  float price= 100.6F;
    @Override
    public String getName() {
        return "Burger";
    }

    @Override
    public float getPrice() {
        return price;
    }
}

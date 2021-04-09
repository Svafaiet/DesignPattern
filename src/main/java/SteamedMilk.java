public class SteamedMilk extends BeverageDecorator{
    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() { return getBeverage().cost() + 0.1;}

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with milk";
    }
}

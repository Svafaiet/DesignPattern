package Decorator;

public class SteamedMilk extends BeverageDecorator{
    public SteamedMilk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() { return getBeverage().getCost() + 0.1;}

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with milk";
    }
}

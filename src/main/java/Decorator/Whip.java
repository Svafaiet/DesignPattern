package Decorator;

public class Whip extends BeverageDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() { return getBeverage().getCost() + 0.1;}

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with whip";
    }
}

package Decorator;

public class Mocha extends BeverageDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() { return getBeverage().getCost() + 0.2;}

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with mocha";
    }
}

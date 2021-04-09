package Decorator;

public abstract class BeverageDecorator extends Beverage{
    protected final Beverage beverage;

    protected BeverageDecorator(Beverage beverage) {
        super("");
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    @Override
    public abstract String getDescription();
}

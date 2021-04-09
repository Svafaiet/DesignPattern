public class Mocha extends BeverageDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() { return getBeverage().cost() + 0.2;}

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + " with mocha";
    }
}

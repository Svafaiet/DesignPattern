package Decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        super("Decorator.HouseBlend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

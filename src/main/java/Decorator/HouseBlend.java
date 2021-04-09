package Decorator;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        super("Decorator.HouseBlend");
    }

    @Override
    public double getCost() {
        return 0.89;
    }
}

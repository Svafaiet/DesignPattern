package Decorator;

public class Espresso extends Beverage {
    public Espresso() { super("Decorator.Espresso"); }

    @Override
    public double getCost() { return 1.99; }
}

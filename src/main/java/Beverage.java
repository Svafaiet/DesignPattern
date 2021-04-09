public abstract class Beverage {
    protected final String name;
    protected Beverage(String name) {
        this.name = name;
    }

    public String getDescription() {
        return "Delicious " + name;
    }



    public abstract double cost();
}

package Bridge;

public abstract class PowerCalc {
    private Multiplier multiplier;

    public PowerCalc(Multiplier multiplier) {
        this.multiplier = multiplier;
    }

    public abstract long pow(int base, int power);

    public Multiplier getMultiplier() {
        return multiplier;
    }
}

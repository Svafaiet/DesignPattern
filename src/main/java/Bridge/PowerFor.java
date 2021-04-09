package Bridge;

public class PowerFor extends PowerCalc {

    public PowerFor(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public long pow(int base, int power) {
        long result = 1;
        for (int i = 0; i < power; i++) {
            result = this.getMultiplier().mult(result, base);
        }
        return result;
    }
}

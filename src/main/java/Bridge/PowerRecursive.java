package Bridge;

public class PowerRecursive extends PowerCalc {

    public PowerRecursive(Multiplier multiplier) {
        super(multiplier);
    }

    @Override
    public long pow(int base, int power) {
        if (power == 0) {
            return 1;
        }
        long result = (power%2==1) ? base : 1;
        result = getMultiplier().mult(
                result,
                getMultiplier().mult(
                        this.pow(base, power/2),
                        this.pow(base, power/2)
                ));
        return result;
    }
}

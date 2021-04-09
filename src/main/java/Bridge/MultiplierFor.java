package Bridge;

public class MultiplierFor implements Multiplier {
    @Override
    public long mult(long a, long b) {
        long result = 0;
        for (int i = 0; i < a; i++) {
            result += b;
        }
        return result;
    }
}


import Bridge.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTests {

    @Test
    void testMultiplierFor() {
        Multiplier multiplier = new MultiplierFor();
        assertEquals(20, multiplier.mult(2, 10));

    }

    @Test
    void testMultiplierNorm() {
        Multiplier multiplier = new MultiplierFor();
        assertEquals(20, multiplier.mult(2, 10));
    }

    @Test
    void testPowerRecursive() {
        ArrayList<Multiplier> multiplierArrayList = new ArrayList<Multiplier>() {
            {
                add(new MultiplierFor());
                add(new MultiplierNorm());
            }
        };
        for (Multiplier multiplier : multiplierArrayList) {
            PowerCalc powerCalc = new PowerRecursive(multiplier);
            assertEquals(powerCalc.pow(6, 5), 7776);
        }
    }

    @Test
    void testPowerFor() {
        ArrayList<Multiplier> multiplierArrayList = new ArrayList<Multiplier>() {
            {
                add(new MultiplierFor());
                add(new MultiplierNorm());
            }
        };
        for (Multiplier multiplier : multiplierArrayList) {
            PowerCalc powerCalc = new PowerFor(multiplier);
            assertEquals(powerCalc.pow(6, 5), 7776);
        }
    }
}

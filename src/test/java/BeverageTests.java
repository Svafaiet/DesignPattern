
import Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeverageTests {

    @Test
    void testHouseBlend() {
        // Pure HouseBlend
        Beverage beverage = new HouseBlend();
        assertEquals("Delicious HouseBlend", beverage.getDescription());
        assertEquals(0.89, beverage.getCost());
    }

    @Test
    void testEspresso() {
        // Pure Espresso
        Beverage beverage = new Espresso();
        assertEquals("Delicious Espresso", beverage.getDescription());
        assertEquals(1.99, beverage.getCost());
    }

    @Test
    void testHouseBlendWithSteamedMilk() {
        // HouseBlend + SteamedMilk
        Beverage beverage = new SteamedMilk(new HouseBlend());
        assertEquals("Delicious HouseBlend with milk", beverage.getDescription());
        assertEquals(0.89 + 0.1, beverage.getCost());
    }

    @Test
    void testEspressoWithMochaAndWhip() {
        // Espresso + Mocha + Whip
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        assertEquals("Delicious Espresso with mocha with whip", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.10, beverage.getCost());
    }

    @Test
    void testEspressoWithDoubleMochaAndWhipAndSteamedMilk() {
        // Espresso + Mocha + Mocha + Whip + SteamedMilk
        Beverage beverage = new SteamedMilk(new Whip(new Mocha(new Mocha(new Espresso()))));
        assertEquals("Delicious Espresso with mocha with mocha with whip with milk", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.2 + 0.1 + 0.1, beverage.getCost());
    }
}

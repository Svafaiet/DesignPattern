
import Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeverageTests {

    @Test
    void testHouseBlend() {
        // Pure HouseBlend
        Beverage beverage = new HouseBlend();
        assertEquals("Delicious Decorator.HouseBlend", beverage.getDescription());
        assertEquals(0.89, beverage.cost());
    }

    @Test
    void testEspresso() {
        // Pure Espresso
        Beverage beverage = new Espresso();
        assertEquals("Delicious Decorator.Espresso", beverage.getDescription());
        assertEquals(1.99, beverage.cost());
    }

    @Test
    void testHouseBlendWithSteamedMilk() {
        // HouseBlend + Decorator.SteamedMilk
        Beverage beverage = new SteamedMilk(new HouseBlend());
        assertEquals("Delicious Decorator.HouseBlend with milk", beverage.getDescription());
        assertEquals(0.89 + 0.1, beverage.cost());
    }

    @Test
    void testEspressoWithMochaAndWhip() {
        // Espresso + Decorator.Mocha + Decorator.Whip
        Beverage beverage = new Whip(new Mocha(new Espresso()));
        assertEquals("Delicious Decorator.Espresso with mocha with whip", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.10, beverage.cost());
    }

    @Test
    void testEspressoWithDoubleMochaAndWhipAndSteamedMilk() {
        // Espresso + Decorator.Mocha + Decorator.Mocha + Decorator.Whip + Decorator.SteamedMilk
        Beverage beverage = new SteamedMilk(new Whip(new Mocha(new Mocha(new Espresso()))));
        assertEquals("Delicious Decorator.Espresso with mocha with mocha with whip with milk", beverage.getDescription());
        assertEquals(1.99 + 0.2 + 0.2 + 0.1 + 0.1, beverage.cost());
    }
}

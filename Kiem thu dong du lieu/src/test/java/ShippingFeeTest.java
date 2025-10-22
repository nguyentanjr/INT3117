import org.example.ShippingCalculator;
import org.junit.Test;
import static org.junit.Assert.*;


public class ShippingFeeTest {
    private final ShippingCalculator calculator = new ShippingCalculator();

    @Test(expected = IllegalArgumentException.class)
    public void test01() {
        calculator.calculateShippingFee(-10, false);
    }

    @Test
    public void test02() {
        assertEquals(25000.0, calculator.calculateShippingFee(200000, false), 0.001);
    }

    @Test
    public void test03() {
        assertEquals(15000.0, calculator.calculateShippingFee(1000000, false), 0.001);
    }

    @Test
    public void test04() {
        assertEquals(12500.0, calculator.calculateShippingFee(200000, true), 0.001);
    }

    @Test
    public void test05() {
        assertEquals(7500.0, calculator.calculateShippingFee(1000000, true), 0.001);
    }

    @Test
    public void test06() {
        assertEquals(0.0, calculator.calculateShippingFee(2000000, true), 0.001);
        assertEquals(0.0, calculator.calculateShippingFee(2000000, false), 0.001);
    }
}

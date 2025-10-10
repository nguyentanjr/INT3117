import org.example.ShippingCalculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShippingFeeTest {
    private final ShippingCalculator calculator = new ShippingCalculator();

    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        calculator.calculateShippingFee(0, true);
    }

    @Test
    public void test2() {
        assertEquals(12500.0, calculator.calculateShippingFee(20000, true), 0.001);
    }

    @Test
    public void test3() {
        assertEquals(25000.0, calculator.calculateShippingFee(20000, false), 0.001);
    }

    @Test
    public void test4() {
        assertEquals(15000.0, calculator.calculateShippingFee(1000000, false), 0.001);
    }

    @Test
    public void test5() {
        assertEquals(0.0, calculator.calculateShippingFee(2000000, true), 0.001);
    }
}

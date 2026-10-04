import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task2_var5 {

    //y = cos^3(x) - sin(2x) + ctg(x)
    public static double calculateY(double x) {
        double cosCube = Math.pow(Math.cos(x), 3);
        double sinDouble = Math.sin(2 * x);
        double tan = Math.tan(x);

        if (Math.abs(tan) < 1e-12) {
            throw new ArithmeticException("ctg(x) не определён при x = " + x);
        }

        return cosCube - sinDouble + 1.0 / tan;
    }

    @Test
    void testX0() {
        try {
            calculateY(0);
            fail("При x = 0 должно быть: ctg не определён");
        } catch (ArithmeticException e) {
        }
    }

    @Test
    void testXPi() {
        try {
            calculateY(Math.PI);
            fail("При x = π должно быть: ctg не определён");
        } catch (ArithmeticException e) {
        }
    }

    @Test
    void testXPiHalf() {
        double result = calculateY(Math.PI / 2);
        assertEquals(0.0, result, 1e-5,
                "При x = π/2 значение y должно быть ≈ 0");
    }

    @Test
    void testXPiQuarter() {
        double result = calculateY(Math.PI / 4);
        assertEquals(0.3535533906, result, 1e-5,
                "При x = π/4 значение y должно быть ≈ 0.353553");
    }

    @Test
    void testXMinusPiQuarter() {
        double result = calculateY(-Math.PI / 4);
        assertEquals(0.35355339059, result, 1e-5,
                "При x = -π/4 значение y должно быть ≈ 0.35355339059");
    }

    @Test
    void testXPiThird() {
        double result = calculateY(Math.PI / 3);
        assertEquals(-0.163675, result, 1e-5,
                "При x = π/3 значение y должно быть ≈ -0.163675");
    }
}
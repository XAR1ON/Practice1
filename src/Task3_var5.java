import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task3_var5 {
    public static double[] swapIfGreater(double A, double B) {

        if (A > B) {
            return new double[]{B, A};
        }
        return new double[]{A, B};
    }

    @Test
    void AGreaterB() {
        double[] result = swapIfGreater(7, 3);
        assertEquals(3, result[0]);
        assertEquals(7, result[1]);
    }

    @Test
    void ASmallerB() {
        double[] result = swapIfGreater(3, 7);
        assertEquals(3, result[0]);
        assertEquals(7, result[1]);
    }

    @Test
    void AEqualsB() {
        double[] result = swapIfGreater(5.0, 5.0);
        assertEquals(5.0, result[0]);
        assertEquals(5.0, result[1]);
    }
}

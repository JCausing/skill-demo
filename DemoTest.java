import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    @Test
    public void multiplyTest() {
        assertEquals(5, Demo.multiply(1, 5));
    }
}

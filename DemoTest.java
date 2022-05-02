import static org.junit.Assert.*;
import org.junit.*;

public Class DemoTest {
    @Test
    public void multiplyTest() {
        assertEquals(10, Demo.multiply(1, 5));
    }
}

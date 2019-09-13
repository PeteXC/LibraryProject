import org.junit.Test;
import Library.Main;

import static org.junit.Assert.assertEquals;

public class MainTest {

    Main mainTest = new Main();

    @Test
    public void test() {
        assertEquals(9, Main.letsTry(3));
    }

}

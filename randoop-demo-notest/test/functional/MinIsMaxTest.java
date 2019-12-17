package functional;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinIsMaxTest {

    @Test
    public void testMin() {
          int min = new MinIsMax().min(1, 2);
          assertEquals(1, min);
    }
}
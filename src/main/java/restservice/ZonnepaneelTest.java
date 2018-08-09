package restservice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Nick on 23-6-2017.
 */
public class ZonnepaneelTest {
    double DELTA = 1e-15;
    @Test
    public void geldigeInput() {
    Zonnepaneel w = new Zonnepaneel();
    double result = w.getKwh(11.0, 85.0);
    assertEquals(96.0, result, DELTA);
    }
}

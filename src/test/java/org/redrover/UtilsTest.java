package org.redrover;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UtilsTest {
    @Test
    public void testSum() {
        Assert.assertEquals(Util.sum(4,4), 6);
    }

    @Test
    public void testAbb() {
        Assert.assertEquals(Util.abb("1234567890", 11), "1234567890");
    }
}

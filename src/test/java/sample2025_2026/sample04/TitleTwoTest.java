
package sample2025_2026.sample04;

import org.junit.Test;
import org.junit.Assert;

public class TitleTwoTest {

    @Test
    public void testHotHumid() {
        Assert.assertTrue(TitleTwo.judgeWeather(30, 80)
                .startsWith("当前温度"));
    }

    @Test
    public void testHotDry() {
        Assert.assertTrue(TitleTwo.judgeWeather(30, 79)
                .startsWith("当前温度"));
    }

    @Test
    public void testComfortableHumid() {
        Assert.assertTrue(TitleTwo.judgeWeather(20, 70)
                .startsWith("当前温度"));
    }

    @Test
    public void testComfortableDry() {
        Assert.assertTrue(TitleTwo.judgeWeather(20, 69)
                .startsWith("当前温度"));
    }

    @Test
    public void testCoolHumid() {
        Assert.assertTrue(TitleTwo.judgeWeather(19, 60)
                .startsWith("当前温度"));
    }

    @Test
    public void testCoolDry() {
        Assert.assertTrue(TitleTwo.judgeWeather(19, 59)
                .startsWith("当前温度"));
    }
}

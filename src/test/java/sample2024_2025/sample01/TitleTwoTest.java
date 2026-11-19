package sample2024_2025.sample01;

import org.junit.Assert;
import org.junit.Test;

public class TitleTwoTest {
    @Test
    public void testMonday() {
        Assert.assertEquals("Monday", TitleTwo.judge("Mo"));
    }

    @Test
    public void testFriday() {
        Assert.assertEquals("Friday", TitleTwo.judge("Fr"));
    }

    @Test
    public void testWednesday() {
        Assert.assertEquals("Wednesday", TitleTwo.judge("We"));
    }

    @Test
    public void testTuesday() {
        Assert.assertEquals("Tuesday", TitleTwo.judge("Tu"));
    }

    @Test
    public void testThursday() {
        Assert.assertEquals("Thursday", TitleTwo.judge("Th"));
    }

    @Test
    public void testSaturday() {
        Assert.assertEquals("Saturday", TitleTwo.judge("Sa"));
    }

    @Test
    public void testSunday() {
        Assert.assertEquals("Sunday", TitleTwo.judge("Su"));
    }

    @Test
    public void testInputError() {
        Assert.assertEquals("输入错误", TitleTwo.judge("Xx"));
    }

    @Test
    public void testFormatError() {
        Assert.assertEquals("格式错误", TitleTwo.judge("A1"));
    }
}
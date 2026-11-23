package sample2024_2025.sample05;

import org.junit.Assert;
import org.junit.Test;

public class TitleOneTest {

    @Test
    public void operation1() {
        Assert.assertTrue(TitleOne.operation(15,8).startsWith("x=a*a*b的值:"));
    }
    @Test
    public void operation2() {
        Assert.assertTrue(TitleOne.operation(-5,-8).startsWith("x=a-b的值:"));
    }
    @Test
    public void operation3() {
        Assert.assertTrue(TitleOne.operation(5,4).startsWith("x=a+b的值:"));
    }
}
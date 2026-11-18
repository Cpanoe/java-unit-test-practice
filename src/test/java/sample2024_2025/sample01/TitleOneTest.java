package sample2024_2025.sample01;

import org.junit.Assert;
import org.junit.Test;

public class TitleOneTest {

    @Test
    public void testInvalid1() {
        Assert.assertEquals("输入不符合要求",
                TitleOne.constructGraph(-5, 5));
    }

    @Test
    public void testInvalid2() {
        Assert.assertEquals("输入不符合要求",
                TitleOne.constructGraph(5, -5));
    }

    @Test
    public void testCircle() {
        Assert.assertEquals("圆形或正方形",
                TitleOne.constructGraph(6, 6));
    }

    @Test
    public void testEllipse() {
        Assert.assertEquals("椭圆",
                TitleOne.constructGraph(5, 2));
    }

    @Test
    public void testRectangle() {
        Assert.assertEquals("矩形",
                TitleOne.constructGraph(10, 2));
    }

    @Test
    public void testLongRectangle() {
        Assert.assertEquals("长方形",
                TitleOne.constructGraph(2, 1));
    }
}
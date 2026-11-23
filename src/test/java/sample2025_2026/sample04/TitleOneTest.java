
package sample2025_2026.sample04;

import org.junit.Test;
import org.junit.Assert;

public class TitleOneTest {

    @Test
    public void testAFirst() {
        Assert.assertEquals("等级为A,首次获奖：是,获奖积分为：100", TitleOne.calculate('A', true));
    }

    @Test
    public void testANotFirst() {
        Assert.assertEquals("等级为A,首次获奖：否,获奖积分为：80", TitleOne.calculate('A', false));
    }

    @Test
    public void testBFirst() {
        Assert.assertEquals("等级为B,首次获奖：是,获奖积分为：60", TitleOne.calculate('B', true));
    }

    @Test
    public void testBNotFirst() {
        Assert.assertEquals("等级为B,首次获奖：否,获奖积分为：40", TitleOne.calculate('B', false));
    }

    @Test
    public void testCFirst() {
        Assert.assertEquals("等级为C,首次获奖：是,获奖积分为：30", TitleOne.calculate('C', true));
    }

    @Test
    public void testCNotFirst() {
        Assert.assertEquals("等级为C,首次获奖：否,获奖积分为：20", TitleOne.calculate('C', false));
    }

    @Test
    public void testInvalidGrade() {
        Assert.assertEquals("无效等级。", TitleOne.calculate('D', true));
    }
}

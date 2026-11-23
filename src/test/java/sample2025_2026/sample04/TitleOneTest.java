package sample2025_2026.sample04;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TitleOneTest {

    @Test
    public void testAFirst() {
        assertThat("等级为A,首次获奖：是,获奖积分为：100", equalTo(TitleOne.calculate('A', true)));
    }

    @Test
    public void testANotFirst() {
        assertThat("等级为A,首次获奖：否,获奖积分为：80", equalTo(TitleOne.calculate('A', false)));
    }

    @Test
    public void testBFirst() {
        assertThat("等级为B,首次获奖：是,获奖积分为：60", equalTo(TitleOne.calculate('B', true)));
    }

    @Test
    public void testBNotFirst() {
        assertThat("等级为B,首次获奖：否,获奖积分为：40", equalTo(TitleOne.calculate('B', false)));
    }

    @Test
    public void testCFirst() {
        assertThat("等级为C,首次获奖：是,获奖积分为：30", equalTo(TitleOne.calculate('C', true)));
    }

    @Test
    public void testCNotFirst() {
        assertThat("等级为C,首次获奖：否,获奖积分为：20", equalTo(TitleOne.calculate('C', false)));
    }

    @Test
    public void testInvalidGrade() {
        assertThat("无效等级。", equalTo(TitleOne.calculate('D', true)));
    }
}

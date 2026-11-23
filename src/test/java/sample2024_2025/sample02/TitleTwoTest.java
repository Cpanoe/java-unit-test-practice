package sample2024_2025.sample02;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class TitleTwoTest {

    @Test
    public void getDaysFalse1() {
        Assert.assertThat(TitleTwo.getDays(1333, 14), equalTo("月份输入不正确"));
    }

    @Test
    public void getDaysTrue1() {
        Assert.assertThat(TitleTwo.getDays(1600, 2), equalTo("1600年2月份的天数是29天"));
    }

    @Test
    public void getDaysTrue2() {
        Assert.assertThat(TitleTwo.getDays(1601, 2), equalTo("1601年2月份的天数是28天"));
    }

    @Test
    public void getDaysTrue3() {
        Assert.assertThat(TitleTwo.getDays(1601, 10), equalTo("1601年10月份的天数是31天"));
    }

    @Test
    public void getDaysTrue4() {
        Assert.assertThat(TitleTwo.getDays(1601, 4), equalTo("1601年4月份的天数是30天"));
    }

    @Test
    public void getDaysTrue5() {
        Assert.assertThat(TitleTwo.getDays(1604, 2), equalTo("1604年2月份的天数是29天"));
    }
}
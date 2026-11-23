package sample2024_2025.sample04;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class TitleOneTest {

    @Test
    public void aOne() {
        Assert.assertThat(TitleOne.calculateA(95, 75), equalTo(null));
    }

    @Test
    public void aTwo() {
        Assert.assertThat(TitleOne.calculateA(85, 75), equalTo("a=2："));
    }

    @Test
    public void aThree() {
        Assert.assertThat(TitleOne.calculateA(60, 50), equalTo("a=3："));
    }

    @Test
    public void aFour() {
        Assert.assertThat(TitleOne.calculateA(75, 75), equalTo("a=4："));
    }
}

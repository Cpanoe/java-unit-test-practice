
package sample2025_2026.sample05;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TitleTwoTest {

    @Test
    public void testInvalidYear() {
        assertThat(TitleTwo.ShengXiao(-1),
                equalTo("年份输入不正确。"));
    }

    @Test
    public void testNegativeRemainder() {
        assertThat(TitleTwo.ShengXiao(0),
                equalTo("年份输入不正确。"));
    }

    @Test
    public void testNormalYear() {
        assertThat(TitleTwo.ShengXiao(4),
                equalTo("4年是甲子年，生肖是鼠"));
    }
}

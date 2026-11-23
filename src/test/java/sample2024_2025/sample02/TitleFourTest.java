package sample2024_2025.sample02;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TitleFourTest {

    private String input;
    private String expected;

    public TitleFourTest(String input, String expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> parm(){
        return Arrays.asList(new Object[][]{
                {"absgagag","替换前缀后的字符串为:efsgagag"},
                {"sgcdcdasgcd","替换cd后的字符串为:sgghghasggh"},
                {"asgagwrqwrszx","大写字母的字符串为:ASGAGWRQWRSZX"}
        });
    }

    @Test
    public void inputString() {
        Assert.assertEquals(expected,TitleFour.inputString(input));
    }
}
package sample2024_2025.sample01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class TitleFourTest {
    final private String userName;
    final private String password;
    final private String expectation;

    public TitleFourTest(String userName, String password, String expectation) {
        this.userName = userName;
        this.password = password;
        this.expectation = expectation;
    }

    @Parameterized.Parameters
    public static List<Object> p(){
        return Arrays.asList(new Object[][]{
//                {null, "asd", "请输入正确的用户名和密码"}, //提高分支命中率
                {null, null, "用户名或密码不能为空"},
                {"admin", "123", "登录成功"},
                {"asd", "123", "请输入正确的用户名"},
                {"admin", "156", "请输入正确的密码"},
                {"asgasg", "asgasg", "请输入正确的用户名和密码"}
        });
    }

    @Test
    public void titleFourTest(){
        Assert.assertEquals(expectation,TitleFour.login(userName,password));
    }
}
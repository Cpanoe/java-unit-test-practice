package sample2024_2025.sample01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

public class TitleThreeTest {
    final String mailError = "邮箱地址不符合要求";
    final String passwordError = "密码不符合要求";

    //邮箱
    @Test
    public void mailTrue1() {
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.com","16451314"),equalTo("信息正确"));
    }
    @Test
    public void mailTrue2() {
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.com.cn","16451314"),equalTo("信息正确"));
    }
    @Test
    public void mailFalse1(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("abcde@163.c","16451314"),equalTo(mailError));
    }
    @Test
    public void mailFalse2(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adg17@163.com","16451314"),equalTo(mailError));
    }
    @Test
    public void mailFalse3(){
        Assert.assertThat(TitleThree.isValidMailAndPassword(null,"16451314"),equalTo(mailError));
    }
    @Test
    public void mailFalse4(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("abcde#163.com","16451314"),equalTo(mailError));
    }
    @Test
    public void mailFalse5(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@113.com","16451314"),equalTo(mailError));
    }
    @Test
    public void mailFalse6(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.ggg","16451314"),equalTo(mailError));
    }
    //密码
    @Test
    public void passwordFalse1(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.com","111"),equalTo(passwordError));
    }
    @Test
    public void passwordFalse2(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.com","sag515af2"),equalTo(passwordError));
    }
    @Test
    public void passwordFalse3(){
        Assert.assertThat(TitleThree.isValidMailAndPassword("adGdE@163.com",null),equalTo(passwordError));
    }
}
package sample2024_2025.sample02;

import org.junit.Assert;
import org.junit.Test;

public class TitleFourAbnormity {
    @Test(expected = IllegalArgumentException.class)
    public void Ab1(){
        TitleFour.inputString("e");
    }
}

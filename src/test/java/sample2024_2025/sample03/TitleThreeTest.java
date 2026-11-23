package sample2024_2025.sample03;

import org.junit.Test;

import static org.junit.Assert.*;

public class TitleThreeTest {

    @Test
    public void testTier1() {
        assertEquals("总提成：0.50万", TitleThree.calculateBonus(5));
    }

    @Test
    public void testTier2() {
        assertEquals("总提成：1.38万", TitleThree.calculateBonus(15));
    }

    @Test
    public void testTier3() {
        assertEquals("总提成：2.25万", TitleThree.calculateBonus(30));
    }

    @Test
    public void testTier4() {
        assertEquals("总提成：3.05万", TitleThree.calculateBonus(50));
    }

    @Test
    public void testTier5() {
        assertEquals("总提成：3.65万", TitleThree.calculateBonus(80));
    }

    @Test
    public void testTier6() {
        assertEquals("总提成：3.96万", TitleThree.calculateBonus(101));
    }
}
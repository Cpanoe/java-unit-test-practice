package sample2024_2025.sample03;

//1,2,4题和以前重复，跳过
public class TitleThree {
    public static String calculateBonus(int profit) {
        double bonus = 0.0;
        if (profit <= 10) {
            bonus = profit * 0.10;
        } else if (profit <= 20) {
            bonus = 10 * 0.10 + (profit - 10) * 0.075;
        } else if (profit <= 40) {
            bonus = 10 * 0.10 + 10 * 0.075 + (profit - 20) * 0.05;
        } else if (profit <= 60) {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + (profit - 40) * 0.03;
        } else if (profit <= 100) {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + (profit - 60) * 0.015;
        } else {
            bonus = 10 * 0.10 + 10 * 0.075 + 20 * 0.05 + 20 * 0.03 + 40 * 0.015 + (profit - 100) * 0.01;
        }

        return String.format("总提成：%.2f万", bonus);
    }
}
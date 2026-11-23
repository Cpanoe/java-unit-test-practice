package sample2024_2025.sample04;

public class TitleOne {
    public static String calculateA(int x, int y) {
        int a;
        if (x >= 80 && y >= 60) {
            if (x >= 90 || y >= 90) {
                return null;
            } else {
                a = 2;
            }
        } else if (x <= 70 || y <= 70) {
            a = 3;
        } else {
            a = 4;
        }
        return "a=" + a + "：";
    }
}

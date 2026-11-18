package sample2024_2025.sample01;

public class TitleOne {
    public static String constructGraph(int x, int y){
        if(x <= 0 || y <= 0){
            return "输入不符合要求";
        }
        int temp = Math.abs(x - y);

        if (x == y) {
            return "圆形或正方形";
        } else if (temp > 2 && temp <= 5) {
            return "椭圆";
        } else if (temp > 5) {
            return "矩形";
        } else {
            return "长方形";
        }
    }
}

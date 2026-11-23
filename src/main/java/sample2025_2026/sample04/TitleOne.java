package sample2025_2026.sample04;

public class TitleOne {
    public static String calculate(char grade, boolean isFirst){
        int integral;
        if (grade == 'A'){
            if (isFirst){
                integral = 100;
            }else{
                integral = 80;
            }
        }
        else if (grade == 'B'){
            if (isFirst){
                integral = 60;
            }else{
                integral = 40;
            }
        }
        else if (grade == 'C'){
            if (isFirst){
                integral = 30;
            }else{
                integral = 20;
            }
        }else {
            return "无效等级。";
        }
        return "等级为" + grade + ",首次获奖：" +
                (isFirst ? "是" : "否") + ",获奖积分为：" + integral;
    }
}

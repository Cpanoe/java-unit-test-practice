package sample2024_2025.sample02;

public class TitleTwo {
    public static String getDays(int year, int month){
        if(month < 1 || month > 12) {
            return "月份输入不正确";
        }/*else if(year < 0){
            return "年份输入不正确";  题目没说,所以不打
        }*/
        int days = 0;

        if (month == 2){
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                days = 31;
            }else{
                days = 30;
            }
        }
        return year + "年" + month + "月份的天数是" + days + "天";
    }
}
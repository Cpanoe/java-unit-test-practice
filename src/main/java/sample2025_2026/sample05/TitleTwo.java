package sample2025_2026.sample05;

public class TitleTwo {
    //因任务1和以前差不多，跳过
    public static String ShengXiao(int year){
        if (year <= 0){
            return "年份输入不正确。";
        }else{
            return year + "年是" + getGanZhi(year) + "年，生肖是" + getZodiac(year);
        }
    }

    // 判断生肖
    private static String getZodiac(int year) {
        String[] zodiac = {
                "鼠", "牛", "虎", "兔", "龙", "蛇",
                "马", "羊", "猴", "鸡", "狗", "猪"
        };

        return zodiac[(year - 4) % 12 < 0 ? ((year - 4) % 12) + 12 : (year - 4) % 12];
    }

    // 判断天干地支
    private static String getGanZhi(int year) {
        String[] heavenlyStems = {
                "甲", "乙", "丙", "丁", "戊",
                "己", "庚", "辛", "壬", "癸"
        };

        String[] earthlyBranches = {
                "子", "丑", "寅", "卯", "辰", "巳",
                "午", "未", "申", "酉", "戌", "亥"
        };
        int index = (year - 4) % 12;
        if (index < 0) {
            index += 12;
        }
        int stemIndex = (year - 4) % 10;
        if (stemIndex < 0) {
            stemIndex += 10;
        }
        return heavenlyStems[stemIndex] + earthlyBranches[index];
    }
}

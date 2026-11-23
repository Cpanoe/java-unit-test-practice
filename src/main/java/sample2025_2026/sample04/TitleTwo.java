package sample2025_2026.sample04;

public class TitleTwo {

    public static String judgeWeather(int temp, int humidity) {
        String weather;

        if (temp >= 30) {
            if (humidity >= 80) {
                weather = "高温高湿，闷热";
            } else {
                weather = "高温干燥，注意防晒";
            }
        } else if (temp >= 20) {
            if (humidity >= 70) {
                weather = "舒适但潮湿";
            } else {
                weather = "舒适宜人";
            }
        } else {
            if (humidity >= 60) {
                weather = "凉爽潮湿";
            } else {
                weather = "凉爽干燥";
            }
        }

        return "当前温度：" + temp + "℃，湿度：" + humidity
                + "%，天气状况为：" + weather + "。";
    }
}

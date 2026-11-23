package sample2024_2025.sample02;

public class TitleFour {
    public static String inputString(String s) {
        if (s.substring(0, 2).equals("ab")) {
            return "替换前缀后的字符串为:ef" + s.substring(2);
        } else if (s.substring(s.length() - 2).equals("cd")) {
            return "替换cd后的字符串为:" + replaceCD(s);
        } else {
            return "大写字母的字符串为:" + s.toUpperCase();
        }
    }

    private static String replaceCD(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'c' && s.charAt(i + 1) == 'd') {
                sb.append("gh");
                i++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
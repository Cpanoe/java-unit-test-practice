package sample2024_2025.sample01;

public class TitleFour {

    public static String login(String username, String password) {
        if (isEmpty(username) && isEmpty(password)) {
            return "用户名或密码不能为空";   //题目和文字冲突 这里按题目
        } else if ("admin".equals(username) && "123".equals(password)) {
            return "登录成功";
        } else if (!"admin".equals(username) && "123".equals(password)) {
            return "请输入正确的用户名";
        } else if ("admin".equals(username)) { // && !"123".equals(password)冗余判断
            return "请输入正确的密码";
        } else {
            return "请输入正确的用户名和密码";
        }
    }

    private static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }
}


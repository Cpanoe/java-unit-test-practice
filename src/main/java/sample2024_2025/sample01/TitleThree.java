package sample2024_2025.sample01;

public class TitleThree {
    public static String isValidMailAndPassword(String mail, String password) {
        String mailError = "邮箱地址不符合要求";
        String passwordError = "密码不符合要求";

        if(mail == null){
            return mailError;
        }
        if(password == null){
            return passwordError;
        }

        //判断邮箱
        //长度
        if (mail.length() != 13 && mail.length() != 16) {
            return mailError;
        }
        //邮箱登录名
        for (int i = 0; i < 5; i++) {
            if (!(mail.charAt(i) >= 'a' && mail.charAt(i) <= 'z' || mail.charAt(i) >= 'A' && mail.charAt(i) <= 'Z')) {
                return mailError;
            }
        }
        //@
        if (mail.charAt(5) != '@') {
            return mailError;
        }
        //主机名
        String host = mail.substring(6, 9);
        if (!(host.equals("163") || host.equals("126"))) {
            return mailError;
        }

        //域名
        String domain = mail.substring(9);
        if (!(domain.equals(".com") || domain.equals(".com.cn"))) {
            return mailError;
        }
        //判断密码
        //长度
        if (password.length() < 6){
            return passwordError;
        }
        //is数字
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) < '0' || password.charAt(i) > '9') {
                return passwordError;
            }
        }
        return "信息正确";
    }
}
package sample2024_2025.sample01;

public class TitleTwo {
    public static String judge(String s){
        if (s == null || s.length() != 2 || (s.charAt(0) < 'A' || s.charAt(0) > 'Z') || (s.charAt(1) < 'a' || s.charAt(1) > 'z' ) ){
            return "格式错误";
        }
        if (s.charAt(0) == 'M'){
            return "Monday";
        }else if(s.charAt(0) == 'F'){
            return "Friday";
        }else if(s.charAt(0) == 'W'){
            return "Wednesday";
        }else if(s.charAt(0) == 'T' && s.charAt(1) == 'u'){
            return "Tuesday";
        }else if(s.charAt(0) == 'T' && s.charAt(1) == 'h'){
            return "Thursday";
        }else if(s.charAt(0) == 'S' && s.charAt(1) == 'a'){
            return "Saturday";
        }else if(s.charAt(0) == 'S' && s.charAt(1) == 'u'){
            return "Sunday";
        }else{
            return "输入错误";
        }

    }
}

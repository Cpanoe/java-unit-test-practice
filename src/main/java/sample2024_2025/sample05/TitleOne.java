package sample2024_2025.sample05;

public class TitleOne {
    public static String operation(int a,int b){
        int x;
        if(a > 9 && b > 5){
            x = a * a * b;
            return "x=a*a*b的值:" + x;
        }else{
            if (a < 0 && b < 0){
                x = a - b;
                return "x=a-b的值:" + x;
            }else{
                x = a + b;
                return "x=a+b的值:" + x;
            }
        }
    }
}


//2、3、4题重复
package GradeOne_1;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {

        //1. 输入的正整数y代表年份
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        //2. 能够被4整除且不能被100整除的年份,或者能够被400整除的年份
        if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0){
            //3. 是闰年，输出 yes;非闰年，输出 no
            System.out.print("yes");
        }else
            System.out.print("no");

    }
}

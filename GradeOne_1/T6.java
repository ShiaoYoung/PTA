package GradeOne_1;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        
        //1. 输入任意一个字符串。
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        //2. 显示它的长度和第一个字符，其间用,分隔。
        System.out.print(str.length() + "," + str.charAt(0));

    }
}

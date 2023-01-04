package GradeOne_1;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {

        //1. 提示用户输入0~15之间的一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个0~15间的整数");
        int num = sc.nextInt();

        //2. 若输入的整数在0~15范围内，则输出对应的十六进制数。否则输出“Invalid input”。
        if (num >= 0 && num <= 15){
            String num1 = (String) Integer.toHexString(num);
            num1 = num1.toUpperCase();
            System.out.println(num1);
        }else
            System.out.println("Invalid input");

    }
}

package PracticeL3;

import java.util.Scanner;

public class T1009 {
    public static void main(String[] args) {
        //1. 输入一句话
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";

        //2. 倒着输出
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ' || i == input.length() - 1){
                result = temp + " " + result;
                temp = "";
                i++;
            }
            if (i < input.length())
                temp += input.charAt(i);
        }

        //3. 输出结果
        System.out.println(result);
    }
}

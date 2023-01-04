package PracticeL3;

import java.util.Scanner;

public class T1002 {
    public static void main(String[] args) {
        //1. 输入一个数字(字符串类型)
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        //2. 计算每位数之和
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            int num = getNum(c);
            sum += num;
        }

        //3. 输出和的每位的拼音
        String result = getPinYin(sum);
        System.out.println(result);
    }

    public static int getNum(char c){
        return c - 48;
    }

    public static String getPinYin(int num){
        String n = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            switch (c){
                case '0' -> result.append("ling");
                case '1' -> result.append("yi");
                case '2' -> result.append("er");
                case '3' -> result.append("san");
                case '4' -> result.append("si");
                case '5' -> result.append("wu");
                case '6' -> result.append("liu");
                case '7' -> result.append("qi");
                case '8' -> result.append("ba");
                case '9' -> result.append("jiu");
            }
            if (i < n.length() - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }
}

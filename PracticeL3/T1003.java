package PracticeL3;

import java.util.Scanner;

public class T1003 {
    public static void main(String[] args) {
        //1. 键入行数
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 键入字符串
        String[] strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.next();
        }

        //3. 判断是否符合条件


        //4. 输出YES 或 NO

    }

    public static boolean checkStr(String str){
        //1. 检查是否只含有P,T,A
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'P' || c == 'T' || c == 'A'){
                count++;
            }
        }
        if (count != str.length()){
            return false;
        }

        //2. 检查是否为 xPTAx aPbTc aPbATca形式
        return false;
    }
}

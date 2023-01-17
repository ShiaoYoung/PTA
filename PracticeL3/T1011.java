package PracticeL3;

import java.util.Scanner;

public class T1011 {
    public static void main(String[] args) {
        //输入个数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //输入每一组
        String[] result = new String[num];
        for (int i = 0; i < result.length; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if ((A + B) > C){
                result[i] = "true";
            }else {
                result[i] = "false";
            }
        }

        //格式化输出结果
        for (int i = 0; i < num; i++) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }
    }
}

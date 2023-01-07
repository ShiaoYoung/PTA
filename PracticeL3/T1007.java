package PracticeL3;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class T1007 {
    public static void main(String[] args) {
        //1. 键入N
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //2. 获取小于N的素数
        ArrayList suShu = new ArrayList<>(1);
        int[] sushu = new int[N];
        int count = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= i; j++) {
                if (j == i){
                    sushu[count] = i;
                    count++;
                }
                if (i % j == 0){
                    break;
                }
            }
        }
        for (int i = 0; i < sushu.length; i++) {
            System.out.println(sushu[i]);
        }


        //3. 计算符合猜想的素数对数

    }
}

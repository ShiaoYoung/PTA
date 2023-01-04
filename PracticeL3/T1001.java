package PracticeL3;

import java.util.Scanner;

public class T1001 {
    public static void main(String[] args) {
        //1.输入一个数字
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2.偶数减半，奇数(3n+1)减半
        int count = 0;
        while (n != 1){
            if (n % 2 == 1){
                n = (3 * n + 1) / 2;
            }else {
                n = n / 2;
            }
            count++;
        }

        //3.计算步数
        System.out.println(count);
    }
}

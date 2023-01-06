package PracticeL3;

import java.util.Scanner;

public class T1006 {
    public static void main(String[] args) {
        //1. 键入n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 计算B、S的数量，以及个位数
        int ge = n % 10;
        n /= 10;
        int S = n % 10;
        n /= 10;
        int B = n % 10;

        //3.输出
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < B; i++) {
            result.append("B");
        }
        for (int i = 0; i < S; i++) {
            result.append("S");
        }
        for (int i = 1; i <= ge; i++) {
            result.append(i);
        }

        System.out.println(result.toString());

    }
}

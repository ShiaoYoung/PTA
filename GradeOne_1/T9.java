package GradeOne_1;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {

        //1. 输入值n的范围是 【1..1000】
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //2. 统计1...n的闭区间中，能够被3整除元素的奇数和偶数的个数
        int countJi = 0;
        int countOu = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0){
                if (i % 2 == 0){
                    countOu++;
                } else if (i % 2 == 1) {
                    countJi++;
                }
            }
        }

        //3. 奇数个数,偶数个数
        System.out.print(countJi + "," + countOu);

    }
}

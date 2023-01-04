package GradeOne_1;

import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        //1.输入2个整数
        Scanner sc = new Scanner(System.in);
        int[] numArr = {sc.nextInt(),sc.nextInt()};

        //2.和、差、乘积和准确的商
        int sum = numArr[0] + numArr[1];
        int jian = numArr[0] - numArr[1];
        int ji = numArr[0] * numArr[1];
        double shang = (double) numArr[0] / (double) numArr[1];

        //3.每一行中依次输出四则运算的结果
        System.out.println(sum);
        System.out.println(jian);
        System.out.println(ji);
        System.out.println(shang);

    }
}

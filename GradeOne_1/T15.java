package GradeOne_1;

import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {

        //1.固定投资M元（整数），每年的年收益达到P（0<P<1，double)，那么经过N（整数）年后
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        double P = sc.nextDouble();
        int N = sc.nextInt();
        double resultFu = M;
        double resultFei = M;

        //2.复利投资，是指每年投资的本金是上一年的本金加收益
        for (int i = 0; i < N; i++) {
            double interest = resultFu * P;
            resultFu = resultFu + interest;
        }
        //  非复利投资是指每年投资金额不包含上一年的收益，即固定投资额
        double interest = M * P;
        for (int i = 0; i < N; i++) {
            resultFei += interest;
        }

        //3.复利收入（含本金），非复利收入（含本金），复利比非复利收入多的部分（全部取整，四舍五入）
        System.out.print((int) resultFu + " ");
        System.out.print((int) resultFei + " ");
        int cha = (int) (resultFu - resultFei);
        System.out.println(cha);
    }
}

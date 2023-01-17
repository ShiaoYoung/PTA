package PracticeL3;

import java.util.ArrayList;
import java.util.Scanner;

public class T1010 {
    public static void main(String[] args) {
        /*//1. 读一行数字（偶数个）
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        while (true){
            int xishu = sc.nextInt();
            int zhishu = sc.nextInt();
            if (zhishu == 0){
                if (!(sc.next().equals(" "))){
                    continue;
                }else
                    break;
            }
            result.add(xishu * zhishu);
            result.add(zhishu - 1);
        }
        //2. 输出
        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1){
                System.out.print(result.get(i) + " ");
            }else {
                System.out.print(result.get(i));
            }
        }*/

        //读入一行
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //读键入的那一行数字
        Scanner sc = new Scanner(input);

        //定义结果的集合
        ArrayList<Integer> result = new ArrayList<>();

        //开始读字符串
        while (sc.hasNextInt()) {
            int xishu = sc.nextInt();
            int zhishu = sc.nextInt();
            if (zhishu == 0){
                continue;
            }
            result.add(xishu * zhishu);
            result.add(zhishu - 1);
        }

        //输出
        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                System.out.print(result.get(i) + " ");
            } else {
                System.out.print(result.get(i));
            }

        }

    }
}

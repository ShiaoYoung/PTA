package GradeOne_1;

import java.util.Scanner;

public class T25 {
    public static void main(String[] args) {
        /*
        第1、2、3、4行的数据含义为如下信息的数量(单位为：万人），若未指定时间即为2020年11月1日标准时点的数据。数据之间用空格作分隔符。








         */

        //1. 输入数据有4行。
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[9];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextDouble();
        }


        // 全国总人口 2010年全国总人口
        //   总家庭户 家庭户总人数 2010年家庭户平均人数
        //   0—14岁人口 15—59岁人口 60岁及以上人口
        //   具有大学文化程度的人口

        //2. 计算
        int a1 = (int) (nums[0] - nums[1]);
        //double a2 =

    }
}

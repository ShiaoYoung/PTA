package PracticeL3;

import java.util.Scanner;

public class T1009 {
    public static void main(String[] args) {
        //1. 输入一句话
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        
        //2. 统计空格数量
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' '){
                count++;
            }
        }
        count++;

        //3. 创建数组，存各个单词
        String[] words = new String[count];

        //4. 单词存入数组
        int count1 = count - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            sb.append(input.charAt(i));
            if (i == input.length() - 1){
                words[count1] = sb.toString();
                sb = new StringBuilder("");
                count1--;
                i++;
                break;
            }
            if (input.charAt(i + 1) == ' ' ){
                words[count1] = sb.toString();
                sb = new StringBuilder("");
                count1--;
                i++;
                continue;
            }
        }

        //5. 输出结果
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1){
                System.out.print(words[i]);
            }else {
                System.out.print(words[i] + " ");
            }
        }
    }
}

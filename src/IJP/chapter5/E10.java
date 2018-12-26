package ijp.chapter5;

import java.util.Scanner;

/**
 * 这道题目注意,不能直接nextInt,否则剩下的那个空格会被nextline读取走,于是使用了两次nextline用来读取数据
 */


public class E10 {
    public static void main(String[] args) {
        int i = 100;
        int count = 1;
        for(;i<=1000;i++){
            if(i%5==0 && i%6==0){
                System.out.print(i+" ");
                if(count%10==0){
                    System.out.println();
                }
                count++;
            }

        }
    }
}

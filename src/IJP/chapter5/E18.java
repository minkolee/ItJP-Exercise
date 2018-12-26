package ijp.chapter5;

import java.util.Scanner;

/**
 * 根据两个循环变量i 和 j 的关系编写程序
 */


public class E18 {
    public static void main(String[] args) {
        int i =1,j=1;
        for(i=1;i<=6;i++){
            for(j=1;j<=i;j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for(i=1;i<=6;i++){
            for(j=1;j<=7-i;j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for(i=1;i<=6;i++){
            for(j=6;j>=1;j--){
                if(j>i){
                    System.out.print("\t");
                } else {
                    System.out.print(j + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for(i=1;i<=6;i++){
            for(j=1;j<=6;j++){
                if(j<i){
                    System.out.print("\t");
                } else {
                    System.out.print(j-(i-1) + "\t");
                }
            }
            System.out.println();
        }
    }
}

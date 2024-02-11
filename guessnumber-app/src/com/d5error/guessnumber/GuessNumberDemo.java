package com.d5error.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberDemo {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(10);// 生成0 - 9间的随机数
        int i;
        for(i = 0; i < 10; i++){
            int myNum = sc.nextInt();
            if(myNum == num){
                break;
            }
            System.out.println("猜错了，请重试");
        }
        if(i == 10){
            System.out.println("机会已用完，答案为" + num);
        }
        else{
            System.out.println("猜对了");
        }
    }
}

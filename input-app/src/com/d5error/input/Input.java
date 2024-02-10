package com.d5error.input;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println("年龄是：" + age);

        System.out.println("请输入名称：");
        String name = sc.next();

        System.out.println("欢迎" + name);
    }
}

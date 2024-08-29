package main.java.com.ohgiraffers.teample;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Nanum d = new Nanum();
        Scanner scr = new Scanner(System.in);
        System.out.println("계산기 만들기");

        System.out.println("첫번째 숫자");
        int a = scr.nextInt();
        System.out.println("두번째 숫자");
        int b = scr.nextInt();
        System.out.println("연산자");
        scr.nextLine();
        char c = scr.next().charAt(0);

        switch (c) {
            case '+' :
                System.out.println(d.plus(a,b)); break;
            case '-' : break;
            case '*' : break;
            case '/' :
                System.out.println(d.nanum(a,b));  break;
            default:
                System.out.println("잘못된 입력");
        }

    }
}

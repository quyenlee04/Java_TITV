package LearWhile;

import java.util.Scanner;

public class ViDuWhile {
    public static void main(String[] args) {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhập vào số gì nào: ");
        a = sc.nextInt();
        while (a != 1) {
            System.out.println("yêu em ");

        }
        int b = 0;
        while (true) {
            System.out.println(b);
            b++;
            if (b == 10000) {
                break;
            }
        }
    }
}

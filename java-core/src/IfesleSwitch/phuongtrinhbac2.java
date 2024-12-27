package IfesleSwitch;

import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp vào a: ");
        a = sc.nextDouble();
        System.out.println("nhâp vào b: ");
        b = sc.nextDouble();
        System.out.println("nhâp vào c: ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if (a < 0) {
            System.out.println("nhap lai a");
        } else {
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x1 = -b / 2 * a;
                System.out.println("phuong trinh cos nghiem kep x1=x2= " + x1);
            } else {
                x1 = (-b - Math.sqrt(delta) / (2 * a));
                x2 = (-b + Math.sqrt(delta) / (2 * a));

                System.out.println("phuong trinh co 2 nghiem phan biet la: ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }

    }
}

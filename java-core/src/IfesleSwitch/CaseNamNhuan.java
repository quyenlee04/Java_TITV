package IfesleSwitch;

import java.util.Scanner;

public class CaseNamNhuan {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng: ");
        thang = sc.nextInt();
        System.out.println("Nhập vào năm: ");
        nam = sc.nextInt();

        switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 40 == 0) {
                    System.out.println("Tháng có 29 ngày");
                } else {
                    System.out.println("Tháng có 28 ngày");
                }
                break;
            default:
                System.out.println("Nhập sai");
        }
    }
}

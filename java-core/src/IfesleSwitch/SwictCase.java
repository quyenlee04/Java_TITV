package IfesleSwitch;

import java.util.Scanner;

public class SwictCase {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào a: ");
        a = sc.nextInt();

        switch (a) {
            case 2: {
                System.out.println("Thứ hai");
                break;
            }
            case 3: {
                System.out.println("Thứ ba");
                break;
            }
            case 4: {
                System.out.println("Thứ tư");
                break;
            }
            case 5: {
                System.out.println("Thứ năm");
                break;
            }
            case 6: {
                System.out.println("Thứ sáu");
                break;
            }
            case 7: {
                System.out.println("Thứ bảy");
                break;
            }
            case 8: {
                System.out.println("Chủ nhật");
                break;
            }

            default: {
                System.out.println("Nhập sai");
            }
        }
    }
}

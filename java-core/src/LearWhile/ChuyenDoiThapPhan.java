package LearWhile;

import java.util.Scanner;

public class ChuyenDoiThapPhan {
    public static void main(String[] args) {
        int thapPhan;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân: ");
        thapPhan = sc.nextInt();
        String nhiPhan = "";

        while (thapPhan > 0) {
            nhiPhan = (thapPhan % 2) + nhiPhan;
            thapPhan = thapPhan / 2;
        }
        System.out.println("Số nhị phân là: " + nhiPhan);
    }
}


package DoWhile;

import java.util.Scanner;

public class ViDuDoWhile {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("i = ");
            i = sc.nextInt();
        } while (i < 3);
    }
}

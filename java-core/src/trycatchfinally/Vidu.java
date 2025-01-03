package trycatchfinally;

import java.util.Scanner;

public class Vidu {
    public static void main(String[] args) {


        try {
            System.out.println("Enter an integer");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println("Enter an integer");
            sc = new Scanner(System.in);
            int b = sc.nextInt();
            System.out.println("Enter an integer");
            sc = new Scanner(System.in);
            int c = sc.nextInt();
            int d = a + b + c;
            System.out.println("Result: " + d);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }

}


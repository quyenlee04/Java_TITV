import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp vào a: ");
        a = sc.nextDouble();
        System.out.println("nhâp vào b: ");
        b = sc.nextDouble();

        if (a == 0){
            if (b == 0){
                System.out.println("phuong trinh vo so nghiem");
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
        else {
            x = -b/a;
            System.out.println("ket qua x la: " + x);
        }
    }
}
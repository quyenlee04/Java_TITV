package continiubreakreturn;

public class continiubreak {
    public static void main(String[] args) {
//        int out, in = 0;
//        ngoai:
//        for (out = 0; out < 10; out++) {
//            for (in = 0; in < 20; in++) {
//                if (in > 10) {
//                    break ngoai;
//                }
//
//            }
//            System.out.println(out + " " + in);
//        }
//        System.out.println(out + " ngoài" + in);

//        int max = 100;
//        for (int i = 0; i < max; i++) {
//            if (i % 2 == 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
                if (j > 5) {
                    return;
                }
            }
            System.out.println("---------------------------");
        }
        System.out.println("done");
    }
}

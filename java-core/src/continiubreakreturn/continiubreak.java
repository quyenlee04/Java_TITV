package continiubreakreturn;

public class continiubreak {
    public static void main(String[] args) {
        int out, in = 0;
        ngoai:
        for (out = 0; out < 10; out++) {
            for (in = 0; in < 20; in++) {
                if (in > 10) {
                    break ngoai;
                }

            }
            System.out.println(out + " " + in);
        }
        System.out.println(out + " ngoài" + in);
    }
}

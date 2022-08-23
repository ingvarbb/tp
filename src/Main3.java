import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite prihode: ");
        double x = s.nextDouble();
        System.out.print("Unesite rashode: ");
        double y = s.nextDouble();
        double z = x - y;
        if (z >= 0) {
            System.out.print("Prihod je: " + z);
        } else {
            z = -z;
            System.out.print("Rashod je: " + z);
        }


    }


}

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite stranice trougla a: ");
        double a = s.nextDouble();
        System.out.print("Unesite stranice trougla b: ");
        double b = s.nextDouble();
        System.out.print("Unesite stranice trougla c: ");
        double c = s.nextDouble();


        if (a + b > c) {
            System.out.print(true);
        } else if (a + c > b) {
            System.out.print(true);
        } else if (b + c > a) {
            System.out.print(true);
        } else {
            {
                System.out.print(false);
            }
        }

    }


}

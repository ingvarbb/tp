import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        double x = s.nextDouble();

        if (x % 5 == 0 && x % 11 == 0) {
            System.out.print("Broj je deljiv sa 5 i sa 11.");
        } else if (x % 11 == 0) {
            System.out.print("Broj je deljiv sa 11.");
        } else if (x % 5 == 0) {
            System.out.print("Broj je deljiv sa 5.");
        } else {
            {
                System.out.print("Nije deljiv ni sa 5 ni sa 11");
            }
        }


    }
}

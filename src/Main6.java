import java.util.Scanner;
//zbir svih parnih i neparnih brojeva od 0 do n (bez tog n)
public class Main6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int n = s.nextInt();
        int sumaParnih = 0;
        int sumaNeparnih = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sumaParnih = sumaParnih + i;
            } else {
                sumaNeparnih = sumaNeparnih + i;

            }
        }
        System.out.println("Suma parnih brojeva je: " + sumaParnih);
        System.out.println("Suma neparnih brojeva je: " + sumaNeparnih);
    }
}

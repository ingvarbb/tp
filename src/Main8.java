import java.util.Scanner;

public class Main8 {
    // Унос и испис бројева док се не унесе 0, hint:Boolean вредност као услов
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite broj: ");
        double x = s.nextDouble();

        while (x != 0) {
            System.out.println(x);
            System.out.print("Unesite broj: ");
            x = s.nextDouble();
        }


    }

}

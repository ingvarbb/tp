import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Da li konvertujete iz C ili F: ");
        String degree = s.nextLine();
        if (degree.equals("C")) {
            System.out.print("Unesite temperaturu u C: ");
            int c = s.nextInt();
            int f = c * (9 / 5) + 32;
            System.out.println("Temperatura u F: " + f);
        } else if (degree.equals("F")) {
            System.out.print("Unesite temperaturu u F: ");
            int f = s.nextInt();
            int c = (f - 32) / (9 / 5);
            System.out.println("Temperatura u C: " + c);
        } else {
            System.out.println("Neispravni unos.");
        }


    }
}

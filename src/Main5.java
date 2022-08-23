import java.util.Scanner;

//suma brojeva od 0 do n

public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");

        int n = s.nextInt();

        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println("Suma je: " + suma);
    }

}

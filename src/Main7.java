import java.util.Scanner;

public class Main7 {
// Мост има носивост M, написати програм који учитава број аутомобила на мосту,
// а затим и масу сваког од њих.
// Затим исписати да ли мост може да издржи све аутомобиле или не

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int suma = 0;
        System.out.print("Unesite nosivost mosta: ");
        int m = s.nextInt();

        System.out.print("Unesite broj automobila: ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Unesite masu automobila " + i + ": ");
            int t = s.nextInt();
            suma = suma + t;
        }
        if (suma <= m) {
            System.out.println("Most ce izdrzati automobile.");
        } else {
            System.out.println("Most nece izdrzati automobile.");
        }


    }
}

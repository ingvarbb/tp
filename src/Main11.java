import java.util.Scanner;

//Unos je broj sa tastature, i jedan random (0,100) broj (sakriven)
//Izlaz programa:
//skriveni broj = našem ulazu "broj je jednak" skriveni broj != "bro nije jednak"
public class Main11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        double a = s.nextDouble();
        double x = Math.random() * 100;
        if (a == x) {
            System.out.println("Broj je: " + x);
        } else {
            System.out.println("Broj nije: " + x);
        }


    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Unesite broj dana: ");
    int brojDana = s.nextInt();


    int brojGodina = brojDana/365;

    int brojNedelja =  (brojDana%365)/7;

    int brojPreostalihDana =(brojDana%365)%7;

    System.out.println("Broj godina je: " + brojGodina + " ,broj nedelja je: " + brojNedelja + " ,broj preostalih dana je: " + brojPreostalihDana);


    }


}

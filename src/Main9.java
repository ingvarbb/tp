import java.util.Scanner;

//Unosi sa tastature brojeve 1,2,3,4
//switch (unos)
//izlaz "Odgovor je 1" .. "Odgovor je 4"
//"Odgovor ne postoji! "
public class Main9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite broj 1,2,3, ili 4: ");
        int a = s.nextInt();

        switch (a) {
            case 1:
                System.out.print("Odgovor je 1.");
                break;
            case 2:
                System.out.print("Odgovor je 2.");
                break;
            case 3:
                System.out.print("Odgovor je 3.");
                break;
            case 4:
                System.out.print("Odgovor je 4.");
                break;
            default:
                System.out.print("Odgovor ne postoji.");
        }


    }


}

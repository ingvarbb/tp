import java.util.Scanner;

//Napraviti klasu DešifrovanjeDNK koja ima:
//        Statičku metodu main koja kao ulaz sa tastature dobija neki znak koji predstavlja početno slovo neke od nukleotida od kojih se sastoje karike DNK lanca.
//        Ako znak ima vrednost 'A','C','G' ili 'T', potrebno je na ekranu ispisati naziv odgovarajuće nukleotide koja počinje tim slovom: Adenin, Citozin, Guanin i Timin.
//        Ako uneti znak nema nijednu od tih vrednosti ispisati na ekranu poruku o grešci.
//sa while dok korisnik ne napravi grešku, tek onda prekida program !
public class Main10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a;
        boolean prekidac = true;
        while (prekidac) {
            System.out.print("Unesite A,C,G ili T: ");
            a = s.next().charAt(0);
            switch (a) {
                case 'A':
                    System.out.println("Adenin.");
                    break;
                case 'C':
                    System.out.println("Citozin.");
                    break;
                case 'G':
                    System.out.println("Guanin.");
                    break;
                case 'T':
                    System.out.println("Timin.");
                    break;
                default:
                    System.out.println("Greska.");
                    prekidac = false;
            }
        }

        }
    }

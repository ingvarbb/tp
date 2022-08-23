import java.util.Scanner;

// Unosi brojeve (0 - 9) sa tastature, n puta, dok ne unese "stop"
// Broji koliko je puta korisnik uneo odredjene brojeve
// Ispisuje broj unetih brojeva
// 1 : 5
// 2 : 54
// ...
// 0 : 12

public class Main12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int no0 = 0;
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        int no4 = 0;
        int no5 = 0;
        int no6 = 0;
        int no7 = 0;
        int no8 = 0;
        int no9 = 0;

        boolean stop = true;

        while (stop) {

            System.out.print("Unesi broj od 0 do 9 ili ako hoćeš da prekineš program unesi stop: ");
            String input = s.nextLine();

            switch (input) {
                case "0":
                    no0++;
                    break;
                case "1":
                    no1++;
                    break;
                case "2":
                    no2++;
                    break;
                case "3":
                    no3++;
                    break;
                case "4":
                    no4++;
                    break;
                case "5":
                    no5++;
                    break;
                case "6":
                    no6++;
                    break;
                case "7":
                    no7++;
                    break;
                case "8":
                    no8++;
                    break;
                case "9":
                    no9++;
                    break;
                default:
                    stop = false;
            }
        }


        System.out.println("0: " + no0);
        System.out.println("1: " + no1);
        System.out.println("2: " + no2);
        System.out.println("3: " + no3);
        System.out.println("4: " + no4);
        System.out.println("5: " + no5);
        System.out.println("6: " + no6);
        System.out.println("7: " + no7);
        System.out.println("8: " + no8);
        System.out.println("9: " + no9);

    }
}
//Da nema break; on bi, da si uneo npr. 3, povecao no3 za 1, pa onda povecao i sve one ispod njega za 1, naisao na default koji prekida
//petlju, izasao iz loopa i ispisao rezultate. Da je break; samo npr kod 3, ako uneses 0 povecace sve no od 0 do 3 za 1, prekinuce petlju,
//opet zatraziti unos i ako sad uneses 3 pa stop sledeci put ukupan broj unosa za 3 bice 2 (dok ce za 0 i 1 biti: 1). Ako uneses
//broj veci od 3 ponasace se kao za slucaj da nema break uopste.
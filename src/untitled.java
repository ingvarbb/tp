//Ovo je sa prvog casa.

import java.util.Scanner;

public class untitled {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner s = new Scanner(System.in);
//        System.out.print("Unesi redni # dana u nedelji: ");
//        int a = s.nextInt();
//
////        if (a > 7 || a < 1) {
////            System.out.println("Unesi opet.");
////        } else {
////            if (a < 6) {
////                System.out.println("Radni dan.");
////            } else {
////                System.out.println("Vikend.");
////            }
////
////        }

//ctrl+alt+l cisti kod
        System.out.print("Unesi koliko imas godina: ");
        int a = s.nextInt();

        if (a < 1) System.out.println("Unesi opet.");
        else if (a < 18) System.out.println("Nudimo vam sok.");
        else System.out.println("Nudimo vam pivo.");
    }

}

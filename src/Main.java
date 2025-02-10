import org.w3c.dom.traversal.NodeIterator;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int zbroj = 0;
    public static void main(String[] args) {
        Test test = new Test();
        test.prvaPublic();
        test.trecaProtected();
        // test.cetvrtaPrivate -- nevidljiva
        test.cetvrtaBezModifikatora();

        String s = "Bok";
        for (int i = 0; i < 10; i++) {
            ispisiPozdrav();
            ispisi(s);
        }

        int i = 0;
        ispisi(i);

        Main objekt = new Main();
        objekt.zbrojiA(2).zbrojiA(3).zbrojiA(4);
        System.out.println(objekt.zbroj);

        System.out.println("unos s brojevima : " + prosjek(1,2,3));
        System.out.println("bez unosa : " + prosjek());

        System.out.println("Unnos 0 : " + prosjek(0));
        System.out.println("unos polja " + prosjek(new double[]{4,5,6}));

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        String niz = "";
        do {
            System.out.println("Unesite niz znakova za provjeru palindroma");
            niz = scanner.nextLine();
            niz = String.join( "", niz.split(" "));
            if (Palindrom.isPalindrome(niz)) {
                System.out.println("Je palindrom");
            } else {
                System.out.println("Nije palindrom");
            }
        } while (!niz.equals("kraj"));
    }

    private static void ispisiPozdrav() {
        System.out.println("Bok bok!");
    }

    private static void ispisi(String s) {
        System.out.println(s);
    }

    // overload metode
    private static void ispisi(int s) {
        System.out.println(s);
    }

    private static  int zbroji(int a, int b) {
        return a+b;
    }

    private Main zbrojiA(int x) {
        zbroj+=x;
        return this;
    }

    private static double prosjek(double... args) {
        double zbroj = 0;
        for (double arg : args) {
            zbroj+= arg;
        }
        return zbroj/args.length;
        // double zbroj = Arrays.stream(args).sum();
        //return Arrays.stream(args).average().getAsDouble();
    }
}
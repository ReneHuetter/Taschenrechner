/**
 * Taschenrechner
 * Author: Rene Hütter
 * Datum: 11.05.2022
 * Version: 1.0
 */

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Taschenrechner {

    static Scanner scanner = new Scanner(System.in);

    static final String answer = "Das Ergebnis ist: ";
    static double erg;

    static ArrayList<Double> listErg = new ArrayList<>();

    public static void main (String[] args) {

        Scanner sc1 = new Scanner(System.in);

        while (true) {

            System.out.println("Wählen Sie die Rechenoperatoren");
            String op = sc1.nextLine();

            switch (op) {
                case "+" -> System.out.println(answer + listErg.add(add(userinput(), userinput())));
                case "-" -> System.out.println(answer + listErg.add(sub(userinput(), userinput())));
                case "/" -> System.out.println(answer + listErg.add(div(userinput(), userinput())));
                case "*" -> System.out.println(answer + listErg.add(multi(userinput(), userinput())));
                case "sqrt" -> System.out.println(answer + listErg.add(sqrt(userinput())));
                case "EXIT" -> System.exit(0);
                default -> System.out.println("FALSCHE EINGABE");
            }
        }
    }

    public static double add (double number, double secnumber) {
        return erg = number + secnumber;
    }

    public static double sub (double number, double secnumber) {
        return erg = secnumber - number;
    }

    public static double div (double number, double secnumber) {
        if (number == 0.00) {
            System.out.println("Es darf keine '0.00' eingeben werden.");
        }
        return erg = number / secnumber;
    }

    public static double multi (double number, double secnumber) {
        return erg = number * secnumber;
    }

    public static double sqrt (double number) {
        return erg = Math.sqrt(number);
    }

    public static double userinput () {
        double d_number =0;
        try {
            System.out.println("Geben Sie eine Zahl ein es sind auch Kommazahlen erlaubt.");
            String number = scanner.nextLine();
            d_number = DecimalFormat.getNumberInstance().parse(number).doubleValue();
            System.out.println(d_number);
        } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("Falsche eingabe");
        }
        return d_number;
    }

    public static void showeList () {
        for (int i = 0; i < listErg.size(); i++) {
            System.out.println(i + 1 +" ");
        }
    }


}

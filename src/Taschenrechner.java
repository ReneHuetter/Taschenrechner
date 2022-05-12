/**
 * Taschenrechner
 * Author: Rene Hütter
 * Datum: 11.05.2022
 * Version: 1.0
 */

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Taschenrechner {

    static Scanner scanner = new Scanner(System.in);

    static final String answer = "Das Ergebnis ist: ";
    static double erg;

    public static void main (String[] args) {

    }

    public static double add () {
        double number = userinput();
        double secnumber = userinput();
        erg = number + secnumber;
        System.out.println(answer + erg);
        return erg;
    }

    public static double sub () {
        double number = userinput();
        double secnumber = userinput();
        erg = secnumber - number;
        System.out.println(answer + erg);
        return erg;
    }

    public static double div () {
        double number = userinput();
        double secnumber = userinput();
        erg = number / secnumber;
        System.out.println(answer + erg);
        return erg;
    }

    public static double multi () {
        double number = userinput();
        double secnumber = userinput();
        erg = number * secnumber;
        System.out.println(answer + erg);
        return erg;
    }

    public static double sqrt () {
        erg = Math.sqrt(userinput());
        System.out.println(answer + erg);
        return erg;
    }

    public static double userinput () {
        double d_number = 0;
        try {
            String number = scanner.nextLine();
            d_number = DecimalFormat.getNumberInstance().parse(number).doubleValue();
            System.out.println(d_number);
        } catch (ParseException e) {
            if (d_number == 0.00) {
                System.out.println("Es darf keine '0.00' eingeben werden.");
            } else {
                e.printStackTrace();
                System.out.println("Falsche eingabe");
            }
        } finally {
            return d_number;
        }
    }
}

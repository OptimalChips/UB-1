import java.util.Scanner;

public class Ubungsblatt1B {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please enter a separator beforehand in the Terminal or cmd");
            return;
        }

        //Separator um die Strings zu trennen.
        String separator = args[0];

        // Erstellung von neuen Scanner oder eingabe object
        Scanner input = new Scanner(System.in);

        //nextline wird zum Lesen der Zeilen verwendet
        //toLowerCase wandelt die Zeichenfolge in Kleinbuchstaben um
        String string1 = input.nextLine().toLowerCase();
        String string2 = input.nextLine().toLowerCase();
        String string3 = input.nextLine().toLowerCase();

        //Verwendung von Konkatenation um ein neues gesamt String zu erstellen
        String resultString = string1 + separator + string2 + separator + string3;

        //Ausgabe von end Ergebnis
        System.out.println(resultString);

        input.close();





    }

}

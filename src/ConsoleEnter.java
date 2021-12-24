
import java.util.Scanner;

public class ConsoleEnter {
    static String saidName;
    static String saidAnsw;
    //static int saidInt;

    // Тут методы ввода с клавиатуры, проверялки, чтобы правильно вводили и бугогашечка
    public static void fromConsStringAnsw() {
        Scanner scan = new Scanner(System.in);
        saidAnsw = scan.nextLine();

        while (saidAnsw.equals("")) {
            PrisonerSays.dontUnderstand();
            saidAnsw = scan.nextLine();
        }
        if (saidAnsw.equalsIgnoreCase("гитлер")) {
            PrisonerSays.hitler();

        } else if (saidAnsw.trim().equals("")) {
            PrisonerSays.space();
            saidAnsw = scan.nextLine();
            if (saidAnsw.trim().equals("")) {
                PrisonerSays.twiceSpace();
            }
        }
    }

    public static void fromConsStringName() {
        Scanner scan = new Scanner(System.in);
        saidName = scan.nextLine();

        while (saidName.equals("")) {
            PrisonerSays.dontUnderstand();
            saidName = scan.nextLine();
        }
        if (saidName.equalsIgnoreCase("гитлер")) {
            PrisonerSays.hitler();

        } else if (saidName.trim().equals("")) {
            PrisonerSays.space();
            saidName = scan.nextLine();
            if (saidName.trim().equals("")) {
                PrisonerSays.twiceSpace();
            }
        }
    }
}

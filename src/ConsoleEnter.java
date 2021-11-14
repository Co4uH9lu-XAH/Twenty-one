
import java.util.Scanner;

public class ConsoleEnter {
    static String saidString;
    //static int saidInt;

    // Тут методы ввода с клавиатуры, проверялки, чтобы правильно вводили и бугогашечка
    public static void fromConsString() {
        Scanner scan = new Scanner(System.in);
        saidString = scan.nextLine();
        while (saidString.equals("")) {
            PrisonerSays.noEnter();
            saidString = scan.nextLine();
        }
        if (saidString.equalsIgnoreCase("гитлер")) {
            PrisonerSays.hitler();

        } else if (saidString.trim().equals("")) {
            PrisonerSays.space();
            saidString = scan.nextLine();
            if (saidString.trim().equals("")) {
                PrisonerSays.twiceSpace();
            }
        }
    }
}

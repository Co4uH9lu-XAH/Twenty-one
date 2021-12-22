// Говорильня. Методы с тем, что говорить.

public class PrisonerSays {
    // Вывод по одной букве, просто потому что могу.
    public static void introductorySpeech() throws InterruptedException {
        String speech = "Арестант: Здорово! Как звать?";
        char[] charArray = speech.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(1);
            System.out.print(chArray);
        }
        System.out.println("");
    }

    public static void letsPlay()  {
        System.out.println("Арестант: Играем в арестанскую народную, " + ConsoleEnter.saidString+ " - Двадцать одно. По простому - очко. Правила, думаю, знаешь.");
        System.out.println("Я сдаю - ты считаешь. Потом поменяемся. И так, пока не надоест.");
    }
    public static void space () {
        System.out.println("Арестант: Давай, все же, назовешься подлинее.");

    }
    public static void twiceSpace (){
        System.out.println("Арестант: Пробел, так пробел.");
        System.exit(1);
    }

    public static void noEnter() {
        System.out.println("A? Не слышу...");
    }

    public static void hitler() {
        System.out.println("Арестант: Aаааааа!!! Охрана, у меня в камере Гитлер! Выпустите меня отсюда!!!!!");
        System.exit(1);
    }
    public static void each() {
        System.out.println("Арестант: Еще?");
    }
    public static void myChange() {
        System.out.println("Арестант: Моя очередь.");
    }
    public static void dontUnderstand() {
        System.out.println("Не понял, сэр?!");
    }
    public static void youChange() {
        System.out.println("Арестант: Теперь, значицца, ты.");
    }

    public static void playAgain() {
        System.out.println("Арестант: Играем дальше?");
    }
}

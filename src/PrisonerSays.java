public class PrisonerSays {
    // Вывод по одной букве, просто потому что могу.
    public static void introductorySpeech() throws InterruptedException {
        String speech = "Здорово! Как звать?";
        char[] charArray = speech.toCharArray();
        for (char chArray : charArray) {
            Thread.sleep(1);
            System.out.print(chArray);
        }
        System.out.println("");
    }

    public static void letsPlay()  {
        System.out.println("Играем в арестанскую народную, " + ConsoleEnter.saidString+ " - Двадцать одно. По простому - очко. Правила, думаю, знаешь.");
        System.out.println("Я сдаю - ты считаешь. Потом поменяемся. И так, пока не надоест.");
    }
    public static void space () {
        System.out.println("Давай, все же, назовешься подлинее.");

    }
    public static void twiceSpace (){
        System.out.println("Пробел, так пробел.");
        System.exit(0);
    }

    public static void noEnter() {
        System.out.println("A? Не слышу...");
    }

    public static void hitler() {
        System.out.println("Aаааааа!!! Охрана, у меня в камере Гитлер! Выпустите меня отсюда!!!!!");
        System.exit(0);
    }
    public static void each() {
        System.out.println("Еще?");
    }


}

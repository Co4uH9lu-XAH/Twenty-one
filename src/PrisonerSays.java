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
        System.out.println("Арестант: Играем в арестанскую народную, " + ConsoleEnter.saidName+ " - Двадцать одно. По простому - очко. Правила, думаю, знаешь.");
        System.out.println("Я сдаю - ты считаешь. Потом поменяемся. И так, пока не надоест. Если надо карту - жми y, если не надо - n.");
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
    public static void prisonerChange() {
        System.out.println("Арестант: Мне карта идет.");
    }
    public static void dontUnderstand() {
        System.out.println("Арестант: Не понял, сэр?!");
    }
    public static void playerChange() {
        System.out.println("Арестант: Тебе карта идет.");
    }

    public static void playAgain() {
        System.out.println("Арестант: Играем дальше?");
    }
    public static void PrisonerWin(){
        System.out.println("Арестант: В общем и целом мы должны понимать глубину наших глубин, потому как " +
                "ничто не мотивирует лучше, чем вот это вот все. Ведь сказано в писании, что не преведи Господь вам " +
                "оказаться в припятских болотах, и созерцать собаку близко к сердцу так, как могут это не только лишь все. " +
                "Такие вот мои слова на последок, сказанные от всего сердца, и нет ничего радостнее мне в этот миг, " +
                "как говорить такие вот мои эти слова торжества и справедливости.   ");
    }
    public static void nowOneWin(){
        System.out.println("Арестант: Месье, женема сен па син жу. Ничья, значицца, Парле ву? ");
    }
    public static void playerWin(){
        System.out.println("Арестант: Вы сражались достойно, сэр Сиделец, и честно одержали заслуженную победу. " +
                "В ознаменование своего поражения сочту за честь передать Вам вот эту фамильную заточку из " +
                "аллюминиевой ложки, которую в моей семье зовут Эскалибуром. Носите ее достойно и поклянитесь " +
                "никогда не обнажать ее во имя несправедливости, а токмо волею пославшея мя жены... Нет, это не то..." +
                "а только для защиты кривых, косых, хромых, убогих. Аминь.");
    }
}

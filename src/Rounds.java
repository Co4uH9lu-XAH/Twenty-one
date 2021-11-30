public class Rounds {


    static int userPoints = 0;
    static int prisonerPoints = 0;
    static int finalUserScore = PlayersDistribution.firstPlayer.userScore;
    static int finalPrisonerScore = PlayersDistribution.secondPlayer.prisonerScore;


    public static void doFirstRound() throws InterruptedException {

        PlayersDistribution.getUserDistribution();

        if (finalUserScore > 21) {
            System.out.println("Арестант: Перебор. Я выиграл.");
            prisonerPoints++;
        } else {
            System.out.println("Давай две");

            PlayersDistribution.getPrisonerDistribution();
            int finalPrisonerScore = PlayersDistribution.secondPlayer.prisonerScore;
            if (finalUserScore > 21) {
                System.out.println("Арестант: Перебор. Ты проиграл.");
                userPoints++;
            } else if (finalPrisonerScore > 21) {
                System.out.println("Арестант: У меня перебор. Ты выиграл.");
                userPoints++;
            } else if (finalPrisonerScore > finalUserScore) {
                System.out.println("Арестант: Я выиграл");
                finalPrisonerScore++;
            } else if (finalPrisonerScore < finalUserScore) {
                System.out.println("Арестант: У меня меньше. Я проиграл.");
                userPoints++;
            } else if (finalPrisonerScore == finalUserScore) {
                System.out.println("Арестант: Поровну. Ничья.");
            }
        }
    }

    public static void doSecondRound() throws InterruptedException {

        PlayersDistribution.getPrisonerDistributionWhenPrisonerFirst();
        if (finalPrisonerScore > 21) {
            System.out.println("Арестант: Перебор. Этот раунд за тобой.");
            userPoints++;
        } else {
            System.out.println("Арестант: Мне хватит. Твоя очередь.");
            PlayersDistribution.getUserDistributionWhenUserSecond();
            int finalUserScore = PlayersDistribution.firstPlayer.userScore;
            if (finalUserScore == finalPrisonerScore) {
                System.out.println("Арестант: Ничья.");
            } else if (finalUserScore>21){
                System.out.println("Арестант: У тебя перебор. Я выиграл. ");
                prisonerPoints++;
            } else if (finalUserScore < finalPrisonerScore) {
                System.out.println("Арестант: У тебя меньше. Я выиграл.");
                prisonerPoints++;
            } else if (finalUserScore > finalPrisonerScore) {
                System.out.println("Арестант: У тебя больше. Ты выиграл.");
                userPoints++;
            }
        }
    }
}

public class Rounds {


    static int userPoints = 0;
    static int prisonerPoints = 0;




    public  void doFirstRound() throws InterruptedException {
        PlayersDistribution dealFirstRound = new PlayersDistribution();
        int userScoreFoFirstRound = dealFirstRound.firstRound.userScore;
        int prisonerScoreFoFirstRound = dealFirstRound.firstRound.prisonerScore;

        dealFirstRound.getUserDistribution();

        if (userScoreFoFirstRound > 21) {
            System.out.println("Арестант: Перебор. Я выиграл.");
            prisonerPoints++;
        } else {
            System.out.println("Давай две");

            dealFirstRound.getPrisonerDistribution();

            if (userScoreFoFirstRound > 21) {
                System.out.println("Арестант: Перебор. Ты проиграл.");
                userPoints++;
            } else if (prisonerScoreFoFirstRound > 21) {
                System.out.println("Арестант: У меня перебор. Ты выиграл.");
                userPoints++;
            } else if (prisonerScoreFoFirstRound > userScoreFoFirstRound) {
                System.out.println("Арестант: Я выиграл");
                prisonerPoints++;
            } else if (prisonerScoreFoFirstRound < userScoreFoFirstRound) {
                System.out.println("Арестант: У меня меньше. Я проиграл.");
                userPoints++;
            } else if (prisonerScoreFoFirstRound == userScoreFoFirstRound) {
                System.out.println("Арестант: Поровну. Ничья.");
            }
        }
    }

    public void doSecondRound() throws InterruptedException {
        PlayersDistribution dealSecondRound = new PlayersDistribution();
        int userScoreForSecondRound = dealSecondRound.secondRound.prisonerScore;
        int prisonerScoreForSecondRound = dealSecondRound.secondRound.prisonerScore;

        dealSecondRound.getPrisonerDistributionWhenPrisonerFirst();
        if (prisonerScoreForSecondRound > 21) {
            System.out.println("Арестант: Перебор. Этот раунд за тобой.");
            userPoints++;
        } else {
            System.out.println("Арестант: Мне хватит. Твоя очередь.");
            dealSecondRound.getUserDistributionWhenUserSecond();
            if (userScoreForSecondRound == prisonerScoreForSecondRound) {
                System.out.println("Арестант: Ничья.");
            } else if (userScoreForSecondRound>21){
                System.out.println("Арестант: У тебя перебор. Я выиграл. ");
                prisonerPoints++;
            } else if (userScoreForSecondRound < prisonerScoreForSecondRound) {
                System.out.println("Арестант: У тебя меньше. Я выиграл.");
                prisonerPoints++;
            } else if (userScoreForSecondRound > prisonerScoreForSecondRound) {
                System.out.println("Арестант: У тебя больше. Ты выиграл.");
                userPoints++;
            }
        }
    }
}

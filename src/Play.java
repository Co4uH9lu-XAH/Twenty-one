

public class Play {

    public static void main(String[] args) throws InterruptedException {

        //Вступительные титры
        // PrisonerSays.introductorySpeech();
        //ConsoleEnter.fromConsString();
        //PrisonerSays.letsPlay();

        // Сдача карт.
        int userPoints = 0;
        int prisonerPoints = 0;
        // Далее две короткие переменные
        // Чтобы в условиях не городить длинную колбасу из обращений класса к методу и к очкам
        
        UserDistribution.getUserDistribution();
        int finalUserScore = UserDistribution.firstPlayer.userScore;
        if (finalUserScore > 21) {
            System.out.println("Арестант: Перебор. Моя очередь.");
            prisonerPoints++;
        } else {
            System.out.println("Давай две");
            UserDistribution.getPrisonerDistribution();
            int finalPrisonerScore = UserDistribution.secondPlayer.prisonerScore;
            if (finalPrisonerScore>21) {
                System.out.println("Арестант: Я проиграл.");
                userPoints++;
            } else if (finalPrisonerScore>finalUserScore){
                System.out.println("Арестант: Я выиграл");
                finalPrisonerScore++;
            } else if (finalPrisonerScore==finalUserScore){
                System.out.println("Арестант: Поровну. Ничья.");
            }
        }
    }
}

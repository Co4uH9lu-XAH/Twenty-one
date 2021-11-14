

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
            System.out.println("Арестант: Перебор. Я выиграл.");
            prisonerPoints++;
        } else {
            System.out.println("Давай две");
            UserDistribution.getPrisonerDistribution();
            int finalPrisonerScore = UserDistribution.secondPlayer.prisonerScore;
            if (finalUserScore>21) {
                System.out.println("Арестант: Перебор. Ты проиграл.");
                userPoints++;
            } else  if (finalPrisonerScore==22){
                System.out.println("Арестант: Редкая удача. Я выиграл.");
                finalPrisonerScore++;
            } else if (finalPrisonerScore>21){
                System.out.println("Арестант: У меня перебор. Ты выиграл.");
                userPoints++;
            } else if (finalPrisonerScore>finalUserScore) {
                System.out.println("Арестант: Я выиграл");
                finalPrisonerScore++;
            } else if (finalPrisonerScore<finalUserScore){
                System.out.println("Арестант: У меня меньше. Я проиграл.");
                userPoints++;
            } else if (finalPrisonerScore==finalUserScore){
                System.out.println("Арестант: Поровну. Ничья.");
            }
        }
    }
}

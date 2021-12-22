

public class Play {

    public static void main(String[] args) throws InterruptedException {

        //Вступительные титры
        //PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        int roundsCount = 0;
        Rounds distributionSecond = new Rounds();
        Rounds distributionFirst = new Rounds();

        distributionFirst.doFirstRound();
        PrisonerSays.myChange();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        distributionSecond.doSecondRound();

        
    }
}

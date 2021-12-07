

public class Play {

    public static void main(String[] args) throws InterruptedException {

        //Вступительные титры
        // PrisonerSays.introductorySpeech();
        //ConsoleEnter.fromConsString();
        //PrisonerSays.letsPlay();

        // Сдача карт.
        Rounds distributionFirst = new Rounds();
        Rounds distributionSecond = new Rounds();
        distributionFirst.doFirstRound();

        System.out.println("Давай исчо!");
        System.out.println();
       // distributionSecond.doFirstRound();

        System.out.println("---------------------------------------------------");

        distributionSecond.doSecondRound();

        

    }
}

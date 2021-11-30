

public class Play {

    public static void main(String[] args) throws InterruptedException {

        //Вступительные титры
        // PrisonerSays.introductorySpeech();
        //ConsoleEnter.fromConsString();
        //PrisonerSays.letsPlay();

        // Сдача карт.
        Rounds.doFirstRound();

        System.out.println("Давай исчо!");
        Rounds.doFirstRound();

        System.out.println("---------------------------------------------------");

        //Rounds.doSecondRound();

        

    }
}

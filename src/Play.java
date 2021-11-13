

public class Play {

    public static void main(String[] args) throws InterruptedException {

        // Вступительные титры
        // PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        UserDistribution.getUserDistribution();
        System.out.println("Давай две");
        UserDistribution.getPrisonerDistribution();
    }
}

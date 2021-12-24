

public class Play {

    public static void main(String[] args) throws InterruptedException {

        //Вступительные титры
        PrisonerSays.introductorySpeech();
        ConsoleEnter.fromConsStringName();
        PrisonerSays.letsPlay();

        // Сдача карт.
        int roundsCount = 1;
        Rounds distributionSecond = new Rounds();
        Rounds distributionFirst = new Rounds();

        System.out.println();
        System.out.println("Шан Цунг: Раунд "+ roundsCount+ " файт!");
        System.out.println();
        distributionFirst.doFirstRound();
        PrisonerSays.prisonerChange();
        System.out.println();
        System.out.println("---------------------------------------------------");
        System.out.println();
        distributionSecond.doSecondRound();
        roundsCount++;

        if (Rounds.prisonerPoints==Rounds.userPoints){
            System.out.println("Арестант: В целом, пока ничья.");
            System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
        } else if (Rounds.prisonerPoints<Rounds.userPoints){
            System.out.println("Арестант: Ты ведешь по итогам встречи.");
            System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
        } else {
            System.out.println("Арестант: Я пока превозмогаю.");
            System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
        }
        System.out.println();
        PrisonerSays.playAgain();

        while (true) {
            ConsoleEnter.fromConsStringAnsw();
            System.out.println();
            if (ConsoleEnter.saidAnsw.equalsIgnoreCase("n")||
                ConsoleEnter.saidAnsw.equalsIgnoreCase("т")) {
                //System.out.println("Арестант: Ну нет, так нет...Я пошел.");
                break;
            } else if (ConsoleEnter.saidAnsw.equalsIgnoreCase("y")||
                    ConsoleEnter.saidAnsw.equalsIgnoreCase("н")){
                if (roundsCount%2==0){
                    System.out.println("Шан Цунг: Раунд "+ roundsCount+ " файт!");
                    System.out.println();
                    distributionSecond.doSecondRound();
                    System.out.println();
                    PrisonerSays.playerChange();
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    distributionSecond.doFirstRound();
                    roundsCount++;
                    if (Rounds.prisonerPoints==Rounds.userPoints){
                        System.out.println("Арестант: В целом, пока ничья.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    } else if (Rounds.prisonerPoints<Rounds.userPoints){
                        System.out.println("Арестант: Ты ведешь по итогам встречи.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    } else {
                        System.out.println("Арестант: Я пока превозмогаю.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    }

                } else if (roundsCount%2!=0){
                    System.out.println("Шан Цунг: Раунд "+ roundsCount+ " файт!");
                    System.out.println();
                    distributionFirst.doFirstRound();
                    PrisonerSays.prisonerChange();
                    System.out.println();
                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    distributionFirst.doSecondRound();
                    roundsCount++;
                    if (Rounds.prisonerPoints==Rounds.userPoints){
                        System.out.println("Арестант: В целом, пока ничья.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    } else if (Rounds.prisonerPoints<Rounds.userPoints){
                        System.out.println("Арестант: Ты ведешь по итогам встречи.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    } else {
                        System.out.println("Арестант: Я пока превозмогаю.");
                        System.out.println("Счет: Арестант: "+ Rounds.prisonerPoints + " "+ ConsoleEnter.saidName + ": "+ Rounds.userPoints);
                    }
                }
                PrisonerSays.playAgain();
            }
        }
        if (Rounds.prisonerPoints>Rounds.userPoints){
            PrisonerSays.PrisonerWin();
        }else if (Rounds.prisonerPoints==Rounds.userPoints){
            PrisonerSays.nowOneWin();
        }else {
            PrisonerSays.playerWin();
        }

    }
}

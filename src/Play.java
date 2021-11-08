import java.util.ArrayList;

public class Play {

    public static void main(String[] args) {


        int deckSize = 36;
        int score = 0;
        int deckIndex = 0;

        // PrisonerSays.introductorySpeech();
        // ConsoleEnter.fromConsString();
        // PrisonerSays.letsPlay();

        // Сдача карт.
        ArrayList<Card> deck = new ArrayList<>(DeckCard.saveDeck());
        ArrayList<Card> dealDeck = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deckSize = deckSize - 1;
            score = score + dealDeck.get(deckIndex).nominal;
            deckIndex = deckIndex + 1;
        }
        System.out.println("Моя колода: " + "\n" + dealDeck.toString());
        System.out.println(score + " очков.");

        PrisonerSays.each();
        ConsoleEnter.fromConsString();
        if (ConsoleEnter.saidString.trim().equals("")) {
            PrisonerSays.noEnter();
            ConsoleEnter.fromConsString();
            if (ConsoleEnter.saidString.trim().equals("")) {
                PrisonerSays.twiceSpace();
                System.exit(0);
            } else if (ConsoleEnter.saidString.equalsIgnoreCase("хватит") ||
                    ConsoleEnter.saidString.equalsIgnoreCase("себе") ||
                    ConsoleEnter.saidString.equalsIgnoreCase("ytn")) {
                System.out.println("Моя колода: " + "\n" + dealDeck.toString());
                System.out.println(score + " очков.");
                PrisonerSays.myChange();
            }
        } else if (ConsoleEnter.saidString.equalsIgnoreCase("еще") ||
                ConsoleEnter.saidString.equalsIgnoreCase("давай") ||
                ConsoleEnter.saidString.equalsIgnoreCase("la")) {

            // берем еще одну карту
            if (score < 21) {
                dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
                deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
                deckSize = deckSize - 1;
                score = score + dealDeck.get(deckIndex).nominal;
                deckIndex = deckIndex + 1;
                System.out.println("Моя колода: " + "\n" + dealDeck.toString());
                System.out.println(score + " очков.");
                if (score < 21) {
                    dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
                    deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
                    deckSize = deckSize - 1;
                    score = score + dealDeck.get(deckIndex).nominal;
                    deckIndex = deckIndex + 1;
                    System.out.println("Моя колода: " + "\n" + dealDeck.toString());
                    System.out.println(score + " очков.");
                }
            } else if (score == 21) {
                System.out.println("Очко. Ты выиграл.");
            } else {
                System.out.println("Перебор. Ты проиграл.");
            }
        }
    }
}


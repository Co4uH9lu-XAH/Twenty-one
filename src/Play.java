import java.util.ArrayList;
import java.util.Random;

public class Play {
    public static void main(String[] args)  {
        // Вступительная речь
       // PrisonerSays.introductorySpeech();
       // ConsoleEnter.fromConsString();
       // PrisonerSays.letsPlay();

        // Сдача карт.
        ArrayList<Card> deck = new ArrayList<>();
        deck = DeckCard.saveDeck();
        int deckSize = 36;
        ArrayList<Card> dealDeck = new ArrayList<>();
            for(int i =0; i<2; i++ ){
                dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
                deck.remove(RandomCard.getRandomCard(deck,  RandomCard.randomInt(deckSize)));
                deckSize = deckSize-1;
            }
        System.out.println("Моя колода: " + dealDeck.toString());
        System.out.println(deckSize);

        PrisonerSays.each();
        ConsoleEnter.fromConsString();

        dealDeck.add(RandomCard.getRandomCard(deck,  RandomCard.randomInt(deckSize)));
         deck.remove(RandomCard.getRandomCard(deck,  RandomCard.randomInt(deckSize)));
        deckSize = deckSize-1;

        System.out.println(dealDeck.toString());
        System.out.println(deckSize);
    }
}

import java.util.ArrayList;

public class Play {
    public static void main(String[] args)  {
        // Вступительная речь
       // PrisonerSays.introductorySpeech();
       // ConsoleEnter.fromConsString();
       // PrisonerSays.letsPlay();

        // Сдача карт.
        ArrayList<Card> deck = new ArrayList<>();
        deck = DeckCard.saveDeck();
        int elementIndex = 35;
        ArrayList<Card> dealDeck = new ArrayList<>();
            for(int i =0; i<3; i++ ){
                dealDeck.add(RandomCard.getRandomCard(deck, elementIndex-1));
               // deck.remove(RandomCard.getRandomCard(deck, elementIndex-1));
                elementIndex = elementIndex-1;
            }
        System.out.println(dealDeck.toString());
        System.out.println(elementIndex);
    }

}

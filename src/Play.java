import java.util.ArrayList;

public class Play {
    public static void main(String[] args)  {
        // Вступительная речь
       // PrisonerSays.introductorySpeech();
       // ConsoleEnter.fromConsString();
       // PrisonerSays.letsPlay();

        // Сдача карт.
     for (Card deckCard: DeliveryOfCards.getThreeCards()){
         System.out.println(deckCard);
        }
     ArrayList<Card> startDeck = new ArrayList<>(DeckCard.saveDeck());
     ArrayList<Card> deckAfterDeal = DeckAfterDeal.getDeckAfterDeal(startDeck,RandomCard.getRandomCard(startDeck));
     for(Card deckCard: deckAfterDeal){
         System.out.println(deckCard);
     }
    }

}

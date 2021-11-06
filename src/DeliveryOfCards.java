import java.util.ArrayList;


public class DeliveryOfCards {

    public static ArrayList<Card> getThreeCards(){
        ArrayList<Card> deck = DeckCard.saveDeck();
        ArrayList<Card> cardsInHand = new ArrayList<>();
        for (int i = 0; i<3; i++){
            cardsInHand.add(RandomCard.getRandomCard(deck));
        }
        return cardsInHand;
    }
}

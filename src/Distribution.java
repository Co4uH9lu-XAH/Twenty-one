import java.util.ArrayList;

public class Distribution {
    int deckSize = 36;
    int userScore = 0;
    int deckIndex = 0;
    ArrayList<Card> deck = new ArrayList<>(DeckCard.saveDeck());
    ArrayList<Card> dealDeck = new ArrayList<>();

    public  void dealTwoCards() {

        for (int i = 0; i < 2; i++) {
            dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deckSize = deckSize - 1;
            userScore = userScore + dealDeck.get(deckIndex).nominal;
            deckIndex = deckIndex + 1;
        }
        System.out.println("Моя колода: " + "\n" + dealDeck.toString());
        System.out.println(userScore + " очков.");

        PrisonerSays.each();
        ConsoleEnter.fromConsString();
       // return userScore;
    }
    public void dealOneCard (){
        dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deckSize = deckSize - 1;
        userScore = userScore + dealDeck.get(deckIndex).nominal;
        deckIndex = deckIndex + 1;

        System.out.println("Моя колода: " + "\n" + dealDeck.toString());
        System.out.println(userScore + " очков.");

        PrisonerSays.each();
        ConsoleEnter.fromConsString();
       // return userScore;
    }
    /*
    public int scoreUserPoints (){
        userScore = userScore + dealDeck.get(deckIndex).nominal;
        return userScore;
    }
         */
}


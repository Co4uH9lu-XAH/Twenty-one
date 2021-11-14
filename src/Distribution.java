import java.util.ArrayList;

public class Distribution {
    int deckSize = 36;
    int userScore = 0;
    int dealDeckIndex = 0;
    int prisonerScore=0;
    ArrayList<Card> deck = new ArrayList<>(DeckCard.saveDeck());
    ArrayList<Card> dealDeck = new ArrayList<>();

    public  void dealTwoCards() throws InterruptedException {
/* В методе сдается две карты и они же удаляются из раздаточной колоды и считаются очки
Очки беруться из поля card nominal
 */
        for (int i = 0; i < 2; i++) {
            dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            userScore = userScore + dealDeck.get(dealDeckIndex).nominal;
            dealDeckIndex = dealDeckIndex + 1;
            deckSize = deckSize - 1;
            Thread.sleep(1000);
        }
        System.out.println("Моя колода: " + "\n" + dealDeck.toString());
        System.out.println(userScore + " очков.");

    }
    public void dealOneCard () {
/* Тут тоже самое, что и в методе выше, только сдается одна карта. Колоды используются единые на все
четыре метода в классе
 */
        dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deckSize = deckSize - 1;
        userScore = userScore + dealDeck.get(dealDeckIndex).nominal;
        dealDeckIndex = dealDeckIndex + 1;

        System.out.println("Моя колода: " + "\n" + dealDeck.toString());
        System.out.println(userScore + " очков.");

    }
/* Методы, аналогичные методам выше, но для раздачи карт арестанту
В раздаточной колоде нет ранее сданных игроку карт
 */
    public  void dealTwoCardsForPrisoner() throws InterruptedException {

        for (int i = 0; i < 2; i++) {
            dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
            prisonerScore = prisonerScore + dealDeck.get(dealDeckIndex).nominal;
            dealDeckIndex = dealDeckIndex + 1;
            deckSize = deckSize - 1;
            Thread.sleep(1000);
        }
        System.out.println("Колода арестанта: " + "\n" + dealDeck.toString());
        System.out.println("У арестанта: "+ prisonerScore + " очков.");

    }
    public void dealOneCardForPrisoner () {
        dealDeck.add(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deck.remove(RandomCard.getRandomCard(deck, RandomCard.randomInt(deckSize)));
        deckSize = deckSize - 1;
        prisonerScore = prisonerScore + dealDeck.get(dealDeckIndex).nominal;
        dealDeckIndex = dealDeckIndex + 1;

        System.out.println("Колода арестанта: " + "\n" + dealDeck.toString());
        System.out.println("У арестанта: " + prisonerScore + " очков.");

    }
}


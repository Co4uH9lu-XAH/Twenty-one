import java.util.ArrayList;

public class Distribution {
    int userScore =0;
    int prisonerScore=0;
    int dealUserDeckIndex = 0;
    int dealPrisonerDeckIndex = 0;

    ArrayList<Card> deck = new ArrayList<>(DeckCard.saveDeck());
    ArrayList<Card> dealUserDeck = new ArrayList<>();
    ArrayList<Card> dealPrisonerDeck = new ArrayList<>();

    public  void dealTwoCards() throws InterruptedException {
/* В методе сдается две карты и они же удаляются из раздаточной колоды и считаются очки
Очки беруться из поля card nominal
 */
        int random = RandomCard.randomInt(deck.size()-1);
        for (int i = 0; i < 2; i++) {

            dealUserDeck.add(RandomCard.getRandomCard(deck, random));
            deck.remove(RandomCard.getRandomCard(deck, random));
            userScore = userScore + dealUserDeck.get(dealUserDeckIndex).nominal;
            dealUserDeckIndex = dealUserDeckIndex + 1;
            Thread.sleep(1000);
        }
        System.out.println("Моя колода: " + "\n" + dealUserDeck.toString());
        System.out.println(userScore + " очков.");

    }
    public void dealOneCard () {
/* Тут тоже самое, что и в методе выше, только сдается одна карта. Раздаточная колода используются единая на все
четыре метода в классе, карты на руках индивидуальны для каждого раунда
 */
        int random = RandomCard.randomInt(deck.size()-1);
        dealUserDeck.add(RandomCard.getRandomCard(deck, random));
        deck.remove(RandomCard.getRandomCard(deck, random));
        userScore = userScore + dealUserDeck.get(dealUserDeckIndex).nominal;
        dealUserDeckIndex = dealUserDeckIndex + 1;

        System.out.println("Моя колода: " + "\n" + dealUserDeck.toString());
        System.out.println(userScore + " очков.");

    }
/* Методы, аналогичные методам выше, но для раздачи карт арестанту
В раздаточной колоде нет ранее сданных игроку карт
 */
    public  void dealTwoCardsForPrisoner() throws InterruptedException {

        int random = RandomCard.randomInt(deck.size()-1);
        for (int i = 0; i < 2; i++) {
            dealPrisonerDeck.add(RandomCard.getRandomCard(deck, random));
            deck.remove(RandomCard.getRandomCard(deck, random));
            prisonerScore = prisonerScore + dealPrisonerDeck.get(dealPrisonerDeckIndex).nominal;
            dealPrisonerDeckIndex = dealPrisonerDeckIndex + 1;
            //deckSize = deckSize - 1;
            Thread.sleep(1000);
        }
        System.out.println("Колода арестанта: " + "\n" + dealPrisonerDeck.toString());
        System.out.println("У арестанта: "+ prisonerScore + " очков.");

    }
    public void dealOneCardForPrisoner () {
        int random = RandomCard.randomInt(deck.size()-1);
        dealPrisonerDeck.add(RandomCard.getRandomCard(deck, random));
        deck.remove(RandomCard.getRandomCard(deck, random));
        prisonerScore = prisonerScore + dealPrisonerDeck.get(dealPrisonerDeckIndex).nominal;
        dealPrisonerDeckIndex = dealPrisonerDeckIndex + 1;

        System.out.println("Колода арестанта: " + "\n" + dealPrisonerDeck.toString());
        System.out.println("У арестанта: " + prisonerScore + " очков.");

    }
}


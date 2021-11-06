
import java.util.ArrayList;

public class DeckCard {
    public static ArrayList<Card> saveDeck () {

        Card heartsSix = new Card("Шестерка", "червей",6);
        Card heartsSeven = new Card("Семерка", "червей", 7);
        Card heartsEight = new Card("Восьмерка", "червей", 8);
        Card heartsNine = new Card("Девятка", "червей", 9);
        Card heartsTen = new Card("Десятка", "червей", 10);
        Card heartsJack = new Card("Валет", "червей", 2);
        Card heartsQueen = new Card("Дама", "червей", 3);
        Card heartsKing = new Card("Король", "червей", 4);
        Card heartsAce = new Card("Туз", "червей", 11);

        Card diamondsSix = new Card("Шестерка", "бубей", 6);
        Card diamondsSeven = new Card("Семерка", "бубей", 7);
        Card diamondsEight = new Card("Восьмерка", "бубей", 8);
        Card diamondsNine = new Card("Девятка", "бубей", 9);
        Card diamondsTen = new Card("Десятка", "бубей", 10);
        Card diamondsJack = new Card("Валет", "бубей", 2);
        Card diamondsQueen = new Card("Дама", "бубей", 3);
        Card diamondsKing = new Card("Король", "бубей", 4);
        Card diamondsAce = new Card("Туз", "бубей", 11);

        Card spadesSix = new Card("Шестерка", "пик", 6);
        Card spadesSeven = new Card("Семерка", "пик", 7);
        Card spadesEight = new Card("Восьмерка", "пик", 8);
        Card spadesNine = new Card("Девятка", "пик", 9);
        Card spadesTen = new Card("Десятка", "пик", 10);
        Card spadesJack = new Card("Валет", "пик", 2);
        Card spadesQueen = new Card("Дама", "пик", 3);
        Card spadesKing = new Card("Король", "пик", 4);
        Card spadesAce = new Card("Туз", "пик", 11);

        Card crossesSix = new Card("Шестерка", "крестей", 6);
        Card crossesSeven = new Card("Семерка", "крестей", 7);
        Card crossesEight = new Card("Восьмерка", "крестей", 8);
        Card crossesNine = new Card("Девятка", "крестей", 9);
        Card crossesTen = new Card("Десятка", "крестей", 10);
        Card crossesJack = new Card("Валет", "крестей", 2);
        Card crossesQueen = new Card("Дама", "крестей", 3);
        Card crossesKing = new Card("Король", "крестей", 4);
        Card crossesAce = new Card("Туз", "крестей", 11);

        ArrayList<Card> deckCard = new ArrayList<>();
        deckCard.add(heartsSix);
        deckCard.add(heartsSeven);
        deckCard.add(heartsEight);
        deckCard.add(heartsNine);
        deckCard.add(heartsTen);
        deckCard.add(heartsJack);
        deckCard.add(heartsQueen);
        deckCard.add(heartsKing);
        deckCard.add(heartsAce);

        deckCard.add(diamondsSix);
        deckCard.add(diamondsSeven);
        deckCard.add(diamondsEight);
        deckCard.add(diamondsNine);
        deckCard.add(diamondsTen);
        deckCard.add(diamondsJack);
        deckCard.add(diamondsQueen);
        deckCard.add(diamondsKing);
        deckCard.add(diamondsAce);

        deckCard.add(spadesSix);
        deckCard.add(spadesSeven);
        deckCard.add(spadesEight);
        deckCard.add(spadesNine);
        deckCard.add(spadesTen);
        deckCard.add(spadesJack);
        deckCard.add(spadesQueen);
        deckCard.add(spadesKing);
        deckCard.add(spadesAce);

        deckCard.add(crossesSix);
        deckCard.add(crossesSeven);
        deckCard.add(crossesEight);
        deckCard.add(crossesNine);
        deckCard.add(crossesTen);
        deckCard.add(crossesJack);
        deckCard.add(crossesQueen);
        deckCard.add(crossesKing);
        deckCard.add(crossesAce);

        return deckCard;
    }
}

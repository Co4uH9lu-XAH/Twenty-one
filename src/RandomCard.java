import java.util.ArrayList;
import java.util.Random;

// Здесь метод возвращает случайную карту, удаляя ее из колоды.

public class RandomCard {

    public static Card getRandomCard(ArrayList<Card> deck, int randomInt){
        deck.get(randomInt);
        //deck.remove(randomInt);
        return deck.get(randomInt);
    }

    public int randomInt (int deckSize){
        Random generator = new Random();
        int randomInt = generator.nextInt(deckSize);
        return randomInt;
    }
}

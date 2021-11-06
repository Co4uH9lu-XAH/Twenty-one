import java.util.ArrayList;
import java.util.Random;

// Здесь метод возвращает случайную карту, удаляя ее из колоды.

public class RandomCard {

    public static Card getRandomCard(ArrayList<Card> deck){
        Random generator = new Random();
        int r = generator.nextInt(deck.size());
        deck.get(r);
        deck.remove(r);
        return deck.get(r);
    }


}

// Общий метод случайного выбора

import java.util.ArrayList;
import java.util.Random;



public class RandomCard {
                                 // Здесь метод возвращает случайную карту.
    public static Card getRandomCard(ArrayList<Card> deck, int randomInt){
        deck.get(randomInt);
        return deck.get(randomInt);
    }
    public static int randomInt(int deckSize){
                                // Тут крафтится случайное число и передается куда надо.
        Random generator = new Random();
        int randomInt = generator.nextInt(deckSize);
        return randomInt;
    }
}

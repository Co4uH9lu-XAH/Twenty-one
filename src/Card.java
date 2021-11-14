// Конструктор объекта типа карта. Ни добавить, ни убавить.

public class Card {
    String card;
    String suit;
    int nominal;

    public Card(String card, String suit, int nominal) {
        this.card = card;
        this.suit = suit;
        this.nominal = nominal;
    }
    @Override
    public String toString() {
        return this.card + " " + this.suit;

    }
}

package Practice_assign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Enum for Suit
enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES
}

// Enum for Rank
enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

// Card class
class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Deck class
class Deck {
    private final List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}

// Main class
public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck before shuffling:");
        deck.printDeck();

        System.out.println("\nShuffled deck:");
        deck.shuffle();
        deck.printDeck();
    }
}

package models;

import models.enums.*;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class DeckOfCards {
    private Stack<Card> deck;

    public DeckOfCards() {
        deck = new Stack<>();

        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card drawCard() {
        if (deck.isEmpty()) {
            return null;
        }
        return deck.pop();
    }

    public void dealCards(List<Player> players, int handSize) {
        if (players.size() * handSize > deck.size()) {
            throw new IllegalArgumentException("Not enough cards in deck");
        }

        for (Player player : players) {
            player.receiveCard(deck.pop());
        }
    }

    public List<Card> getDeck() {
        return deck;
    }
}

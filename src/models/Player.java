package models;

import java.util.ArrayList;
import java.util.List;

public class Player {
    protected List<Card> hand;
    protected List<Card> selectedCards;
    protected String name;

    public Player() {
    }

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.selectedCards = new ArrayList<>();
        this.name = name;
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public int handSize() {
        return hand.size();
    }


}

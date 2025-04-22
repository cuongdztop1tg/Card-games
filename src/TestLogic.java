import games.SamLocGameLogic;
import models.Card;
import models.Deck;
import models.enums.Rank;
import models.enums.Suit;

import java.util.*;

import static java.util.Arrays.sort;

public class TestLogic {
    public static void main(String[] args) {
        SamLocGameLogic logic = new SamLocGameLogic();
        Deck deck = new Deck();
        Deck hi = new Deck();

        Card c1 = new Card(Suit.HEARTS, Rank.SIX);
        Card c2 = new Card(Suit.DIAMONDS, Rank.SIX);
        Card c3 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card c4 = new Card(Suit.SPADES, Rank.FOUR);
        Card c5 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card c6 = new Card(Suit.HEARTS, Rank.FOUR);
        Card c7 = new Card(Suit.DIAMONDS, Rank.SEVEN);
        Card c8 = new Card(Suit.SPADES, Rank.SEVEN);

        List<Card> cards = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8));

        System.out.println(logic.isNConsecutivePairs(cards));
    }
}
import games.SamLocGameLogic;
import models.Card;
import models.DeckOfCards;
import models.enums.Rank;
import models.enums.Suit;

import java.util.*;

import static java.util.Arrays.sort;

public class TestLogic {
    public static void main(String[] args) {
        SamLocGameLogic logic = new SamLocGameLogic();
        DeckOfCards deck = new DeckOfCards();

        Card c1 = new Card(Suit.HEARTS, Rank.SIX);
        Card c2 = new Card(Suit.DIAMONDS, Rank.SIX);
        Card c3 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card c4 = new Card(Suit.SPADES, Rank.FOUR);
        Card c5 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card c6 = new Card(Suit.HEARTS, Rank.SEVEN);

        List<Card> cards = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5, c6));

        System.out.println(logic.isThreeConsecutivePairs(cards));
    }
}
import games.SamLocGameLogic;
import games.TienLenMienBacGameLogic;
import models.Card;
import models.Deck;
import models.enums.Rank;
import models.enums.Suit;

import java.util.*;

import static java.util.Arrays.sort;

public class TestLogic {
    public static void main(String[] args) {
        SamLocGameLogic logic1 = new SamLocGameLogic();
        TienLenMienBacGameLogic logic2 = new TienLenMienBacGameLogic();

        Deck deck = new Deck();
        Deck hi = new Deck();

        Card c1 = new Card(Suit.HEARTS, Rank.SIX);
        Card c2 = new Card(Suit.DIAMONDS, Rank.SIX);
        Card c3 = new Card(Suit.HEARTS, Rank.FIVE);
        Card c4 = new Card(Suit.SPADES, Rank.FOUR);
        Card c5 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card c6 = new Card(Suit.HEARTS, Rank.FOUR);
        Card c7 = new Card(Suit.HEARTS, Rank.SEVEN);
        Card c8 = new Card(Suit.SPADES, Rank.SEVEN);
        Card c9 = new Card(Suit.CLUBS, Rank.FOUR);
        Card c10 = new Card(Suit.DIAMONDS, Rank.FOUR);
        Card c11 = new Card(Suit.HEARTS, Rank.FIVE);

        List<Card> cards = new ArrayList<>(Arrays.asList(c4, c5, c6, c11, c1, c2));
//        cards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        List<Card> ololo = new ArrayList<>(Arrays.asList(c1, c3, c6, c8));
//        System.out.println(cards);
        System.out.println(ololo);
        System.out.println(logic2.isSequence(ololo));
        System.out.println(cards);
    }
}
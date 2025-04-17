package games;

import models.Card;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SamLocGameLogic {
    public SamLocGameLogic() {
    }

    public boolean isPair(List<Card> selectedCards) {
        return selectedCards.size() == 2 && selectedCards.get(0).getRank() == selectedCards.get(1).getRank();
    }

    public boolean isPair(Card c1, Card c2) {
        return c1.getRank() == c2.getRank();
    }

    public boolean isThreeOfKind(List<Card> selectedCards) {
        return selectedCards.size() == 3
                && selectedCards.get(0).getRank() == selectedCards.get(1).getRank()
                && selectedCards.get(1).getRank() == selectedCards.get(2).getRank();
    }

    public boolean isFourOfKind(List<Card> selectedCards) {
        return selectedCards.size() == 4
                && selectedCards.get(0).getRank() == selectedCards.get(1).getRank()
                && selectedCards.get(1).getRank() == selectedCards.get(2).getRank()
                && selectedCards.get(2).getRank() == selectedCards.get(3).getRank();
    }

    public boolean isNConsecutivePairs(List<Card> selectedCards) {
        if (selectedCards.size() % 2 != 0 && selectedCards.size() < 6) {
            return false;
        }
        selectedCards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        // Check pair condition
        for (int i = 0; i <= selectedCards.size() - 2; i += 2) {
            if (!isPair(selectedCards.get(i), selectedCards.get(i + 1))) {
                return false;
            }
        }
        // Check consecutive ranks
        for (int i = 0; i < selectedCards.size() - 2; i += 2) {
            if (selectedCards.get(i).getRank().getValue() != selectedCards.get(i + 2).getRank().getValue() - 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isSequence(List<Card> selectedCards) {
        if (selectedCards.size() < 3) {
            return false;
        }
        selectedCards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        if (selectedCards.get(0).getRank().getValue() == 2) {
            return false;
        }
        for (int i = 1; i < selectedCards.size(); i++) {
            if (selectedCards.get(i).getRank().getValue() != selectedCards.get(i - 1).getRank().getValue() + 1) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidMove(List<Card> selectedCards, List<Card> currentTable) {
        int selectedCardsSize = selectedCards.size();
        int currentTableSize = currentTable.size();
        if (currentTableSize == 1) {
            if (currentTable.get(0).getRank().getValue() == 2) {
                return isFourOfKind(selectedCards);
            }
        }
        return true;
    }
}

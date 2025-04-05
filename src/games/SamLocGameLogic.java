package games;

import models.Card;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SamLocGameLogic {
    public SamLocGameLogic() {
    }

    public boolean isValidMove(List<Card> selectedCards, List<Card> currentTable) {
        return true;
    }

    public boolean isPair(List<Card> selectedCards) {
        return selectedCards.size() == 2 && selectedCards.get(0).getRank() == selectedCards.get(1).getRank();
    }

    public boolean isThreeConsecutive(List<Card> selectedCards) {
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

    public boolean isThreeConsecutivePairs(List<Card> selectedCards) {
        if (selectedCards.size() != 6) {
            return false;
        }
        selectedCards.sort(Comparator.comparing(Card::getRank).thenComparing(Card::getSuit));
        return selectedCards.get(0).getRank() == selectedCards.get(1).getRank()
                && selectedCards.get(2).getRank() == selectedCards.get(3).getRank()
                && selectedCards.get(4).getRank() == selectedCards.get(5).getRank()
                && selectedCards.get(1).getRank().getValue() == selectedCards.get(2).getRank().getValue() - 1
                && selectedCards.get(3).getRank().getValue() == selectedCards.get(4).getRank().getValue() - 1;
    }
}

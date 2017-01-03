package codewars.kyu7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class PokerHand {

    public static boolean IsStraight(ArrayList<Integer> cards) {
        if (cards.size() < 5) {return false;}
        addCardOneWhenAceDedected(cards);
        List<Integer> cardsList = cards.stream().distinct().sorted().collect(Collectors.toList());
        if (isStraight(cardsList) >=5){
            return true;
        }
        return false;
        }

    private static int isStraight(List<Integer> cardsList) {
        int straightCounter=1;
        for (int i = 0; i < cardsList.size()-1; i++) {
            if (cardsList.get(i) == cardsList.get(i + 1) - 1) {
                straightCounter++;
            }
        }
        return straightCounter;
    }

    private static void addCardOneWhenAceDedected(ArrayList<Integer> cards) {
        if(cards.stream().anyMatch(i->i==14)){
            cards.add(1);
        }
    }
}



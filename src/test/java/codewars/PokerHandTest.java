package codewars;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PokerHandTest {
    @Test
    public void test1IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(3);
        hand.add(4);
        hand.add(5);
        hand.add(6);
        assertTrue("2, 3, 4, 5, 6", PokerHand.IsStraight(hand));
    }

    @Test
    public void test2IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(14);
        hand.add(5);
        hand.add(4);
        hand.add(2);
        hand.add(3);
        assertTrue("14, 5, 4 ,2, 3", PokerHand.IsStraight(hand));
    }

    @Test
    public void test3IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(2);
        hand.add(3);
        assertFalse("2, 3", PokerHand.IsStraight(hand));
    }

    @Test
    public void test4IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(7);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(3);
        hand.add(4);
        hand.add(14);
        assertFalse("7, 7, 12 ,11, 3, 4, 14", PokerHand.IsStraight(hand));
    }

    @Test
    public void test5IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(10);
        hand.add(7);
        hand.add(12);
        hand.add(11);
        hand.add(13);
        hand.add(4);
        hand.add(14);
        assertTrue("10, 7, 12, 11, 13, 4, 14", PokerHand.IsStraight(hand));
    }

    @Test
    public void test6IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(3);
        hand.add(3);
        hand.add(14);
        hand.add(5);
        hand.add(3);
        hand.add(2);
        hand.add(4);
        assertTrue("[3, 3, 14, 5, 3, 2, 4", PokerHand.IsStraight(hand));
    }

    @Test
    public void test7IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(10);
        hand.add(14);
        hand.add(14);
        hand.add(13);
        hand.add(12);
        hand.add(10);
        hand.add(11);
        assertTrue("10, 14, 14 ,13, 12, 10, 11", PokerHand.IsStraight(hand));
    }

    @Test
    public void test8IsStraight() {
        ArrayList<Integer> hand = new ArrayList<Integer>();
        hand.add(5);
        hand.add(9);
        hand.add(4);
        hand.add(14);
        hand.add(3);
        hand.add(14);
        hand.add(2);
        assertTrue("5, 9, 4, 14, 3, 14, 2", PokerHand.IsStraight(hand));
    }
}
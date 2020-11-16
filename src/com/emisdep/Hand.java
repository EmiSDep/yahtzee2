package com.emisdep;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hand {
    private List<Die> dice;

    public  Hand() {
        dice = new ArrayList<Die>();
        for(int count = 0; count  < 5; count++) {
            dice.add(new Die());
        }
    }

    public void roll(Random rand) {
        for (var die : dice) {
            die.roll(rand);
        }
    }

    public void  roll(Random rand, int choice) {
        dice.get(choice).roll(rand);
    }

    public void roll(Random rand, List<Integer> choices) {
        for (int choice : choices) {
            roll(rand, choice);
        }
    }

    public List<Integer> getDice() {
        List<Integer> values = new ArrayList<>();
        for (var die : dice) {
            values.add(die.getValue());
        }
        return values;
    }

    public boolean Yahtzee() {
        int isYahtzee = dice.get(0).getValue();
        for(Die die: dice) {
            if (isYahtzee != die.getValue()) {
                System.out.println("Not Yahtzee");
                return false;
            }
        }
        System.out.println("YAHTZEE!");
        return true;
    }

}

package com.emisdep;

import java.util.Random;

public class Game {
    private Random rand = new Random();


    public void StartGame() {

        Hand myHand = new Hand();
        myHand.roll(rand);
        for (var i = 0; i < 3; i++){
            if(i == 0){
                myHand.roll(rand);

            }
            else {
                myHand.roll(rand, YahtzeeConsole.getChoices());
            }
            YahtzeeConsole.displayHand(myHand.getDice());
        }
        if(myHand.Yahtzee()) {
        }
    }
}

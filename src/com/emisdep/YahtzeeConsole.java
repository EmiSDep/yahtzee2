package com.emisdep;

import java.util.ArrayList;
import java.util.List;

public class YahtzeeConsole extends Console {
    static public void welcome() {
        welcome("Name");
    }

    static public void displayHand(List<Integer> dice) {
        System.out.println("---------");
        for (var die : dice) {
            System.out.print(die + " ");
        }
        System.out.print("\n---------\n");
    }

    static public int getChoice() {
        System.out.print("Which die do you want to reroll 1-5: ");
        String reroll = scanner.nextLine();
        return Integer.parseInt(reroll) - 1;
    }

    static public List<Integer> getChoices() {
        System.out.print("What die do you want to reroll : ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        List<Integer> choices = new ArrayList<>();
        for (String choice : inputArray) {
            choices.add(Integer.parseInt(choice) - 1);
        }
        return choices;

    }

}
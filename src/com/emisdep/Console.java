package com.emisdep;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome(String playerName) {
        System.out.println("Welcome " + playerName);
    }

}

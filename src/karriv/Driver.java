/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Main Driver class
 * Name: Venkata reddy Karri
 * Last Updated: 09/11/2024
 */
package karriv;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    protected static final int MIN_DICE = 2;
    protected static final int MAX_DICE = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int[] input = getInput();
                int numDice = input[0];
                int numSides = input[1];
                int numRolls = input[2];

                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();

    }

    private static int[] getInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of dice to roll," +
                " how many sides the dice have,");
        System.out.println("and how many rolls to complete, separating the values by a space.");
        System.out.println("Example: \"2 6 1000\"");
        System.out.println();
        System.out.print("Enter configuration:");
        String[] userInput = scanner.nextLine().split(" ");

        if (userInput.length != 3) {
            throw new IllegalArgumentException("Invalid input: Expected 3 values but only received "
                    + userInput.length);
        }


        try {
            return new int[] {
                    Integer.parseInt(userInput[0]),
                    Integer.parseInt(userInput[1]),
                    Integer.parseInt(userInput[2])
            };
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: All values must be whole numbers.");
        }
    }


    private static Die[] createDice(int numDice, int numSides){

        if (numDice < MIN_DICE || numDice > MAX_DICE) {
            throw new IllegalArgumentException("Number of dice must be between "
                    + MIN_DICE + " and " + MAX_DICE);
        }
        if (numSides < Die.MIN_SIDES || numSides > Die.MAX_SIDES) {
            throw new IllegalArgumentException("Bad die creation: Illegal number of sides: "
                    + numSides);
        }

        Die[] dice = new Die[numDice];
        for(int i = 0; i < numDice; i++){
            dice[i] = new Die(numSides);
        }

        return dice;
    }


}
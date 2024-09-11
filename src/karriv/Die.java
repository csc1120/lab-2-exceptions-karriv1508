/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * Die class
 * Name: Venkata reddy Karri
 * Last Updated: 09/11/2024
 */
package karriv;

import java.util.Random;

/**
 * Represents a die with a specified number of sides.
 * The die can be rolled to generate random values.
 */
public class Die {

    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;

    private int currentValue;
    private int numSides;
    private Random random;

    /**
     * Constructs a new Die with the specified number of sides.
     *
     * @param numSides the number of sides for the die
     * @throws IllegalArgumentException if the number of sides is less than MIN_SIDES or greater than MAX_SIDES
     */
    public Die(int numSides){

        if(numSides < MIN_SIDES || numSides > MAX_SIDES){
            throw new IllegalArgumentException("The No.of sides is out of bounds");
        }

        this.numSides = numSides;
        random = new Random();
        this.currentValue = 0;

    }

    /**
     * Returns the current value of the die and resets it to 0.
     *
     * @return the current value of the die
     * @throws DieNotRolledException if the die has not been rolled (current value is out of valid range)
     */

    public int getCurrentValue() {
        if (currentValue == 0) {
            throw new DieNotRolledException();
        }
        int value = currentValue;
        currentValue = 0;
        return value;
    }


    /**
     * Rolls the die and generates a new random value.
     */
    public void roll(){

        currentValue = random.nextInt(numSides) + 1;
    }



}
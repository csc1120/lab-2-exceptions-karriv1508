/*
 * Course: CSC1020
 * Lab 2 - Exceptions
 * DieNotRolledException class
 * Name: Venkata reddy Karri
 * Last Updated: 09/11/2024
 */
package karriv;

/**
 * Represents an exception that is thrown when an attempt is made to get the value of a die
 * that has not been rolled yet.
 *
 * This exception extends RuntimeException, making it an unchecked exception.
 *
 */
public class DieNotRolledException extends RuntimeException {

    /**
     * Provides a custom error message for this exception.
     *
     * @return A string containing the error message "Die has not been rolled yet"
     */
    @Override
    public String getMessage() {
        return "Die has not been rolled yet";
    }
}

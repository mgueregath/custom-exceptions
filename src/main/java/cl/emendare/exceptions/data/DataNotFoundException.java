/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.data;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class DataNotFoundException extends RuntimeException implements MappedException {

    public DataNotFoundException() {
        super("The requested data was not found");
    }
}

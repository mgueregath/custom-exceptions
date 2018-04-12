/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.data;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class AlreadyExistException extends RuntimeException implements MappedException {

    public AlreadyExistException() {
        super("This already exist");
    }
}

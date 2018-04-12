/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.auth;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class UnauthorizedException extends RuntimeException implements MappedException {

    public UnauthorizedException() {
        super("You do not have permissions to access");
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}

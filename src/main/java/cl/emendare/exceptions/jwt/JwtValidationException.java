/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.jwt;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class JwtValidationException extends RuntimeException implements MappedException {

    public JwtValidationException() {
        super("The authorization token is not valid");
    }
}

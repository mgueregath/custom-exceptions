/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.jwt;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class MalformedJwtException extends RuntimeException implements MappedException {

    public MalformedJwtException() {
        super("A malformed token has been provided");
    }
}

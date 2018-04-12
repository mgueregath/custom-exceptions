/*
 * Tasty.
 */
package cl.emendare.exceptions.jwt;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class JwtInvalidationException extends RuntimeException implements MappedException {

    public JwtInvalidationException() {
        super("An error has occurred during the token invalidation");
    }
}

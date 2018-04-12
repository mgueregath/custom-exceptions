/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.jwt;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class JwtGenerationException extends RuntimeException implements MappedException {

    public JwtGenerationException() {
        super("The token could not be generated");
    }
}

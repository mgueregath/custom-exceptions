/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.security;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class ForbiddenException extends RuntimeException implements MappedException {

    public ForbiddenException() {
        super("You don't have the necessary permissions to perform this action or access to the requested information");
    }
}

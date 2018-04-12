/*
 * Tasty.
 */
package cl.emendare.exceptions.validation;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class EmailAddressValidationException extends RuntimeException implements MappedException {

    public EmailAddressValidationException() {
        super("Invalid email address");
    }
}

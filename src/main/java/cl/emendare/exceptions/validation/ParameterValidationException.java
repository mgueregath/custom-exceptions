/*
 * Blumar Process Control System.
 */
package cl.emendare.exceptions.validation;

import cl.emendare.exceptions.MappedException;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class ParameterValidationException extends RuntimeException implements MappedException {

    public ParameterValidationException() {
        super("All requested parameters must be provided");
    }

    public ParameterValidationException(String reason) {
        super(reason);
    }
}

/*
 * Tasty.
 */
package cl.emendare.exceptions.persistence;

/**
 *
 * @author Mirko Gueregat @mgueregath <mgueregath@emendare.cl>
 */
public class DeletingException extends RuntimeException {

    public DeletingException() {
        super("An error has occurred deleting the entity");
    }
}

package validationsystem;

/**
 *
 * @author echum
 */
/**
 * A collection of reusable validation rules used across every field on the
 * registration form. Every method is static because a Validator has no
 * data of its own to hold between calls, it simply takes a value in and
 * returns whether that value passed a specific rule.
 *
 * Kept deliberately separate from MainFrame so that the validation rules
 * have no knowledge of Swing, JTextFields, or the UI at all - this class
 * only knows about plain Java values (String, int).
 */
public class Validator {
    private Validator() {
    }

    /**
     * Presence check: confirms a value was actually entered.
     * Returns false for null, an empty string, or a string that is
     * only whitespace (e.g. someone hitting spacebar).
     */
    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    public static boolean isAlphabetic(String value) {
        return value != null && value.matches("[a-zA-Z ]+");
    }

    /**
     * Type check: confirms a value contains only digits (0-9).
     * Used for fields that should be purely numeric, such as student
     * number and cellphone number.
     */
    public static boolean isNumeric(String value) {
        return value != null && value.matches("[0-9]+");
    }
    
      /**
     * Length check: confirms a value is exactly the given number of
     * characters long. Used after a numeric check, e.g. enforcing an
     * 8-digit student number or a 10-digit cellphone number.
     */
    public static boolean hasExactLength(String value, int length) {
        return value != null && value.length() == length;
    }

     /**
     * Format check: confirms a value matches a basic email pattern:
     * one or more characters, an "@" symbol, a domain name, a dot,
     * then a 2+ letter extension (e.g. name@domain.com).
     */
    public static boolean matchesEmailFormat(String value) {
        return value != null && value.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }
    
    /**
     * Range check: confirms a whole number falls between min and max,
     * inclusive. Used for validating a calculated age against a
     * sensible lower and upper bound.
     */
    public static boolean isInRange(int value, int min, int max) {
    return value >= min && value <= max;
    }
}

package validationsystem;

/**
 *
 * @author echum
 */
public class Validator {
    private Validator() {
    }

    public static boolean isNotEmpty(String value) {
        return value != null && !value.trim().isEmpty();
    }

    public static boolean isAlphabetic(String value) {
        return value != null && value.matches("[a-zA-Z ]+");
    }

    public static boolean isNumeric(String value) {
        return value != null && value.matches("[0-9]+");
    }

    public static boolean hasExactLength(String value, int length) {
        return value != null && value.length() == length;
    }

    public static boolean matchesEmailFormat(String value) {
        return value != null && value.matches("^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }
    
    public static boolean isInRange(int value, int min, int max) {
    return value >= min && value <= max;
    }
}

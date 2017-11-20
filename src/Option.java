import java.util.NoSuchElementException;

public enum Option {
    EXIT(0, "0: EXIT"),
    ADD_CLOTHES(1, "1: Add piece of cloth"),
    READ_DATA(2, "2: Read recorded data");

    private int value;

    public String getDescription() {
        return description;
    }

    public int getValue() {
        return value;
    }

    private String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }

    public static Option createFromInt(int option) throws NoSuchElementException {
        Option result = null;
        try {
            result = Option.values()[option];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException("Lack of element");
        }
        return result;
    }
}

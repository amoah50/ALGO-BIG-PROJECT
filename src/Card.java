public class Card {
    private final String suit;
    private final String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {
        return switch (value) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10" -> 10;
            case "Jack" -> 10;
            case "Queen" -> 10;
            case "King" -> 10;
            case "Ace" -> 11;
            default -> 0;
        }; // Can also be 1, but we handle that in the Player class.
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}


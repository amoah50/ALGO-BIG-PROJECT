import java.util.ArrayList;

public class Player {
    protected ArrayList<Card> hand;

    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandValue() {
        int value = 0;
        int aceCount = 0;

        for (Card card : hand) {
            value += card.getValue();
            if (card.toString().contains("Ace")) {
                aceCount++;
            }
        }

        while (value > 21 && aceCount > 0) {
            value -= 10;
            aceCount--;
        }

        return value;
    }

    public void displayHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Total value: " + getHandValue());
    }

    public boolean hasBusted() {
        return getHandValue() > 21;
    }
}


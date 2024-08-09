import java.util.Scanner;

public class Game {
    private final Deck deck;
    private final Player player;
    private final Dealer dealer;

    public Game() {
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
    }

    public void start() {
        dealInitialCards();
        playerTurn();
        if (!player.hasBusted()) {
            dealerTurn();
        }
        determineOutcome();
    }

    private void dealInitialCards() {
        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
    }

    @SuppressWarnings("resource")
    private void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your hand:");
            player.displayHand();
            System.out.println("Dealer's first card:");
            dealer.showFirstCard();

            System.out.println("Do you want to 'hit' or 'stand'?");
            String action = scanner.nextLine();

            if (action.equalsIgnoreCase("hit")) {
                player.addCard(deck.dealCard());
                if (player.hasBusted()) {
                    System.out.println("You have busted!");
                    break;
                }
            } else if (action.equalsIgnoreCase("stand")) {
                break;
            }
        }
    }

    private void dealerTurn() {
        System.out.println("Dealer's turn:");
        dealer.displayHand();
        while (dealer.shouldHit()) {
            System.out.println("Dealer hits.");
            dealer.addCard(deck.dealCard());
            dealer.displayHand();
        }
        if (dealer.hasBusted()) {
            System.out.println("Dealer has busted!");
        } else {
            System.out.println("Dealer stands.");
        }
    }

    private void determineOutcome() {
        int playerValue = player.getHandValue();
        int dealerValue = dealer.getHandValue();

        System.out.println("Final hands:");
        System.out.println("Your hand:");
        player.displayHand();
        System.out.println("Dealer's hand:");
        dealer.displayHand();

        if (player.hasBusted()) {
            System.out.println("Dealer wins!");
        } else if (dealer.hasBusted()) {
            System.out.println("You win!");
        } else if (playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("Dealer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

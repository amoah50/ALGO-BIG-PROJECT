public class Dealer extends Player {

    public void showFirstCard() {
        System.out.println(hand.get(0));
    }

    public boolean shouldHit() {
        return getHandValue() < 17;
    }
}

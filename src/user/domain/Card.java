package user.domain;

public class Card {
    private int card;
    private double balance;

    public Card() {
    }

    public Card(int card, double balance) {

        this.card = card;
        this.balance = balance;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

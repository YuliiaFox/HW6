package user.impl;

import user.UserRetirementAgeChecking;
import user.domain.Card;
import user.exceptions.UserRetirementAgeCheckingException;

public class UserRetirementAgeCheckingIml implements UserRetirementAgeChecking {
    private int age;
    private Card card;

    public UserRetirementAgeCheckingIml() {
    }

    public UserRetirementAgeCheckingIml(int age, Card card) {

        this.age = age;
        this.card = card;
    }

    public int getAge() {
        return age;
    }

    public Card getCard() {
        return card;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void userRetirementAge() throws UserRetirementAgeCheckingException {
        if(this.age >= AGE){
            this.card.setBalance(this.card.getBalance()+3000);
        }
        else {
            throw new UserRetirementAgeCheckingException("entered age less than 60");
        }

    }
}

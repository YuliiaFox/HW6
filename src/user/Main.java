package user;

import user.domain.Card;
import user.impl.UserRetirementAgeCheckingIml;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        Card card = new Card();
        UserRetirementAgeChecking userRetirementAgeChecking = new UserRetirementAgeCheckingIml(age, card);
        userRetirementAgeChecking.userRetirementAge();
        System.out.println("Balance is:" + ((UserRetirementAgeCheckingIml) userRetirementAgeChecking).getCard().getBalance());

    }
}

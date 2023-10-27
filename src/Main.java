import com.bankofamerica.db.BankOfAmericaDB;
import com.bankofamerica.db.UserAccountHandlerOfBankOfAmerica;
import  com.mehnaaz.sdk.bank.model.User;
import   com.mehnaaz.sdk.bank.model.Card;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setAccountId(1);
        user.setName("MehnaazUser");
        user.setSignature("MehnaazSignature");

        Card card = new Card();
        card.setCardNumber("12344");


        System.out.println("Came here after getting card");
        UserAccountHandlerOfBankOfAmerica userAccountHandler = new UserAccountHandlerOfBankOfAmerica (BankOfAmericaDB.getInstance());
        userAccountHandler.setBankDB();

        System.out.println(MessageFormat.format("The balance of account 1 is{0}", userAccountHandler.getBalance("1")));
        userAccountHandler.withdraw(900,"1");

        System.out.println(MessageFormat.format("The balance of account 1 is{0}", userAccountHandler.getBalance("1")));

        System.out.println("Hello world!");
    }
}
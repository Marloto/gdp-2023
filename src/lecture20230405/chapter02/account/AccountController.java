package lecture20230405.chapter02.account;

import java.util.Iterator;
import java.util.Scanner;

public class AccountController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Account[] accounts = new Account[4];
        accounts[0] = new Account("DE02500105170137075030", 1234);
        accounts[1] = new Account("DE91100000000123456789", 1234);
        accounts[2] = new Account("DE02100100100006820101", 1234);
        accounts[3] = new Account("DE02120300000000202051", 1234);
        
        String iban = scanner.next();
        int pin = scanner.nextInt();
        
        // Was wäre notwendig für einen "login"
        // -> schleife, zur iteration
        // -> prüfen ob iban richtig ist
        // -> pin prüfen?
        // -> login Methode für pin
        
        for (int i = 0; i < accounts.length; i++) {
            Account cur = accounts[i];
            if(cur.getIban().equals(iban)) {
                if(cur.login(pin)) {
                    // ...
                }
            }
        }
    }
}

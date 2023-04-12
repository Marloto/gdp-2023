package lecture20230413.chapter02.account;

public class Account {
    private String iban;
    private int pin;
    private double balance;

    public Account(String iban, int pin, double balance) {
        this(iban, pin);
        this.balance = balance;
    }

    public Account(String iban, int pin) {
        this.iban = iban;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public String getIban() {
        return iban;
    }
    
    public boolean login(int pin) {
        return this.pin == pin;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public String toString() {
        return iban + ": " + balance;
    }

    public boolean equals(Object obj) {
        // Kein Acc. als obj übergeben, vgl. Kapitel 3
        // obj == null?
        if(obj == null) {
            return false; // weil this nie gleich null sein kann
        }
        Account other = (Account) obj;
        
        String ibanOther = other.iban; // könnte null sein!
        String ibanCur = this.iban;
        
        if(ibanOther == null && ibanCur == null) {
            return true;
        } else if(ibanOther == null) {
            return false;
        }
        
        boolean res = ibanOther.equals(ibanCur);
        
        return res;
    }
    
    public void print() {
        System.out.println(this.toString());
    }
    
    public static String fix(String iban) {
        // DE02500105170137075030 <- dieses Format soll raus kommen am Ende!
        // de02500105170137075030
        // de02 5001 0517 0137 0750 30
        // de02-5001-0517-0137-0750-30
        
        // Aufgabe: egal was übergeben wird, korregieren Sie die IBAN in das 1. Format
        // -> zweimal replace für leerzeichen / bindestriche, toUpperCase
        // -> char-Array aus String, iteration über Array, Zeichen überprüfen, Array wieder zu String
        
//         return iban.replace(" ", "").replace("-", "").toUpperCase();
        
//        String a = iban.replace(" ", "");
//        String b = a.replace("-", "");
//        String c = b.toUpperCase();
//        return c;
        
//        iban = iban.replace(" ", "");
//        iban = iban.replace("-", "");
//        iban = iban.toUpperCase();
//        return iban;
        
//        char[] array = iban.toCharArray();
//        for(int i = 0; i < array.length; i ++) {
//            
//        }
        String res = "";
        for(int i = 0; i < iban.length(); i ++) {
            char c = iban.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                res += c;
            } else if(c >= '0' && c <= '9') {
                res += c;
            } else if(c >= 'a' && c <= 'z') {
                c -= 'a' - 'A';
                res += c;
                // c -= 32;
            }
        }
        return res;
        // return null;
    }
    
    public static void main(String[] args) {
        System.out.println(Account.fix("de02-5001-0517-0137-0750-30"));
        System.out.println(Account.validate("DE02500105170137075030"));
    }
    
    public static boolean validate(String iban) {
        String location = iban.substring(0, 2);
        String checksum = iban.substring(2, 4);
        String remaining = iban.substring(4);
        String digits = "";

        if (!location.equals("DE")) {
            System.out.println("Should start with DE");
            return false;
        }
        if (iban.length() != 22) {
            System.out.println("Must have 22 characters");
            return false;
        }

        // Rearrange iban
        iban = remaining + location + checksum;

        // Replace non digits with A = 10, B = 11, ...
        for (int i = 0; i < iban.length(); i++) {
            char charAt = iban.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                digits += charAt - 'A' + 10;
            } else if (charAt >= '0' && charAt <= '9') {
                digits += charAt;
            } else {
                System.out.println("Bad character at " + i + ": " + charAt);
                return false;
            }
        }

        // Checksum validation
        String check = digits.substring(0, 2);
        digits = digits.substring(2);
        for (int i = 0; i < digits.length(); i += 7) {
            int chars = Math.min(digits.length(), i + 7);
            String frag = digits.substring(i, chars);
            int p = Integer.parseInt(check + frag) % 97;
            check = "" + p;
        }

        if (Integer.parseInt(check) == 1) {
            return true;
        }
        System.out.println("Checksum mismatch");
        return false;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
}

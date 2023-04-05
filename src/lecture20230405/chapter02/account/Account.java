package lecture20230405.chapter02.account;

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
}

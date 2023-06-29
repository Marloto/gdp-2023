package lecture20230622.chapter11.chef;
public class Chef implements Runnable{
    
    private String name;
    private Orders orders;
    private boolean working;
    private Recipe current;
    private double state;

    public Chef(String name, Orders orders) {
        this.name = name;
        this.orders = orders;
        this.working = false;
    }
    
    public boolean isWorking() {
        return working;
    }
    
    public void run() {
        this.working = true;
        while(orders.size() > 0) {
            current = orders.get();
            CookingSimulator3000X.cooking(current, (s) -> state = s);
        }
        this.working = false;
    }
    
    public void start() {
        Thread thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }
    
    
    // Wie kann der Chef parallel aus orders Bestellungen entnehmen und diese abarbeiten
    
    public String toString() {
        if(this.working) {
            int s = (int)(this.state * 100.0);
            return String.format("%5s: %20s %6s", this.name, this.current, s != 100 ? s + "%" : "fertig");
        }
        return String.format("%5s: %27s", this.name, "nichts zu tun");
    }
}
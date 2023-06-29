package lecture20230622.chapter11.chef;

/**
 * Possible recipes in this scenario
 * 
 * @author seb
 *
 */
public enum Recipe {
    SPAGHETTI_BOLOGNAISE((2 * 60 + 45) * 60), 
    CHICKEN_FRICASEE((5 * 60 + 30) * 60), 
    CHEESBURGER(40 * 60),
    FRENCH_FRIES(20 * 60), 
    CESAR_SALAD(20 * 60);

    private long timeInSeconds;

    private Recipe(long timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    /**
     * Returns time to cook in seconds
     * 
     * @return
     */
    public long getTimeInSeconds() {
        return timeInSeconds;
    }

    /**
     * Returns time to cook in milliseconds
     * 
     * @return
     */
    public long getTimeInMillisecond() {
        return timeInSeconds * 1000;
    }
}
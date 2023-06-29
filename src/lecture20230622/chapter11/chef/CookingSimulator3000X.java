package lecture20230622.chapter11.chef;

import java.util.function.Consumer;

public class CookingSimulator3000X {
    private static final long SPEED_UP = 1000;
    
    /**
     * Simulate cooking process, use parameter state 
     * as callback to receive current processing state.
     * 
     * @param recipe
     * @param state
     */
    public static void cooking(Recipe recipe, Consumer<Double> state) {
        try {
            // Send 0.0 as current start state
            state.accept(0.0);
            
            // Calculate time based on recipe
            long time = recipe.getTimeInMillisecond() / SPEED_UP;
            long overall = time;
            
            // Refresh state every 100ms
            while(time > 100) {
                Thread.sleep(100);
                // Send new state
                state.accept((1.0 - (double) time / (double) overall));
                time -= 100;
            }
            
            // Wait remaining time
            Thread.sleep(time);
            
            // Set final state
            state.accept(1.0);
            
            // Wait for clean the cooking space!
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
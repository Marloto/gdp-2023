package lecture20230622.chapter11.chef;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Orders orders = new Orders();
        orders.add(Recipe.CESAR_SALAD);
        orders.add(Recipe.FRENCH_FRIES);
        orders.add(Recipe.SPAGHETTI_BOLOGNAISE);
        orders.add(Recipe.SPAGHETTI_BOLOGNAISE);
        orders.add(Recipe.CHEESBURGER);
        orders.add(Recipe.CHICKEN_FRICASEE);
        orders.add(Recipe.CESAR_SALAD);
        orders.add(Recipe.FRENCH_FRIES);
        orders.add(Recipe.CHEESBURGER);
        orders.add(Recipe.CESAR_SALAD);
        orders.add(Recipe.FRENCH_FRIES);
        orders.add(Recipe.SPAGHETTI_BOLOGNAISE);
        orders.add(Recipe.CHEESBURGER);
        
        System.out.println("Starte mit " + orders.size() + " Rezepten");
        
        Chef chef1 = new Chef("Max", orders);
        Chef chef2 = new Chef("Erika", orders);
        Chef chef3 = new Chef("Inge", orders);
        
        // Aktivieren Sie folgende Zeilen, um die Köche arbeiten zu lassen
        chef1.start(); 
        chef2.start(); 
        chef3.start(); 
        
        waitUntilFinished(orders, new Chef[] {chef1, chef2, chef3});
    }

    private static void waitUntilFinished(Orders orders, Chef[] chefs) throws InterruptedException {
        Thread.sleep(1000); // wait chef starts
        while(Arrays.asList(chefs).stream().filter(c -> c.isWorking()).count() > 0) {
            System.out.format("ToDo %2s | %33s | %33s | %33s", 
                    Stream.concat(Arrays.asList(orders.size()).stream().map(i -> i.toString()), 
                            Arrays.asList(chefs).stream()).toArray());
            System.out.println();
            Thread.sleep(1000);
        }
        System.out.println("Alles gekocht!");
    }
}
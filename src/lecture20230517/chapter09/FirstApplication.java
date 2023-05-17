package lecture20230517.chapter09;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

// Andere (nicht public) Klasse
class MyOtherFancyEventHandler implements EventHandler<ActionEvent> {
    public void handle(ActionEvent event) {
        System.out.println("Click!");
    }
}

public class FirstApplication extends Application {
    
    private int counter = 0;
    
    // Innere Klasse -> instanziierung in enclosing object von FirstClass (Konstruktor oder 
    // irgend eine nicht statische Methode 
    // -> verwendung außerhalb aber möglich!
    public class MyFooFancyEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            System.out.println("Click: " + (counter ++));
        }
    }
    
    public MyFooFancyEventHandler createEventHandler() {
        return new MyFooFancyEventHandler();
    }
    
    // Static Innere Klasse
    private static class MyBarFancyEventHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            System.out.println("Click!");
        }
    }
    
    public static void main(String[] args) {
        // new MyFooFancyEventHandler(); <- geht nicht, weil
        // in Objekt von FirstApplication erzeugt werden
        // muss!
        new MyBarFancyEventHandler();
    }

    public void start(Stage primaryStage) throws Exception {
        // Muss die Stage befüllt werden!
        
        Button button = new Button("Test!");
        
//        button.setOnAction(new MyFancyEventHandler());
//        button.setOnAction(new MyOtherFancyEventHandler());
//        button.setOnAction(new MyFooFancyEventHandler());
//        button.setOnAction(new MyBarFancyEventHandler());
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Click: " + (counter ++));
            }
        });
        button.setOnAction((event) -> {
            System.out.println("Click: " + (counter ++));
        });
        button.setOnAction((event) -> System.out.println("Click: " + (counter ++)));
        
        
        Scene scene = new Scene(button, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

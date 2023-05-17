package lecture20230517.chapter09;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

// Normale Klasse
public class MyFancyEventHandler implements EventHandler<ActionEvent> {

    public void handle(ActionEvent event) {
        System.out.println("Click!");
    }


}

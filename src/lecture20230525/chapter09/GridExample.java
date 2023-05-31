package lecture20230525.chapter09;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GridExample extends Application{
    List<Person> personen = new ArrayList<>();
    
    
    public void start(Stage primaryStage) throws Exception {
        
        
        // Personaldaten
        // Vorname, Nachname, Anschrift, PLZ, Stadt?
        
        TextField vorname = new TextField();
        TextField nachname = new TextField();
        TextField anschrift = new TextField();
        TextField plz = new TextField();
        TextField city = new TextField();
        
        Button save = new Button("Speichern!");
        Button cancel = new Button("Abbrechen");
        
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Vorname"), 0, 0);
        gridPane.add(vorname, 1, 0);
        gridPane.add(new Label("Nachname"), 0, 1);
        gridPane.add(nachname, 1, 1);
        gridPane.add(new Label("Anschrift"), 0, 2);
        gridPane.add(anschrift, 1, 2);
        gridPane.add(new Label("PLZ"), 0, 3);
        gridPane.add(plz, 1, 3);
        gridPane.add(new Label("City"), 0, 4);
        gridPane.add(city, 1, 4);
        
        // Speichern der TextField-Inhalte in eine Personen klasse
        save.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Person person = new Person();
                person.setName(nachname.getText());
                person.setVorname(vorname.getText());
                personen.add(person);
            }
        });
        
        // ChoiceBox zur auswahl von elementen in der Liste
        // Editierbarkeit, neue Elemente erzeugen, Speichern...
        
        
        // Man kann aus Threads keine JavaFX-GUI-Elemente modifizieren! Da gibt es Exceptions :)
        Platform.runLater(new Runnable() {
            public void run() {
                
            }
        });
        
        
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(save, cancel);
        gridPane.add(hBox, 0, 5, 2, 1);
//        gridPane.add(cancel, 0, 6);
        // tabelle => col / row
        primaryStage.setScene(new Scene(gridPane, 400, 300));
        primaryStage.show();
    }

}

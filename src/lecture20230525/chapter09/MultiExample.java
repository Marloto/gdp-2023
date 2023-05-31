package lecture20230525.chapter09;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultiExample extends Application {

    public void start(Stage primaryStage) throws Exception {
        // for schleife
        
        VBox vbox = new VBox();
        List<Node> children = vbox.getChildren();
        
        Parameters parameters = this.getParameters();
        String countString = parameters.getRaw().get(0);
        int count = Integer.parseInt(countString);
        
        List<TextField> fields = new ArrayList<>();
        for(int i = 0; i < count; i ++) {
            TextField field = new TextField();
            // Abspeichern der fields in einer Struktur
            fields.add(field);
            children.add(field);
        }
        
        Button button = new Button("Ausgeben");
        children.add(button);
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                for(TextField field : fields) {
                    System.out.println("Text: " + field.getText());
                }
            }
        });
        
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // init- und start-methode sind möglich
    }
}

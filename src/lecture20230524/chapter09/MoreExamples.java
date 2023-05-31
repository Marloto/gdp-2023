package lecture20230524.chapter09;

import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MoreExamples extends Application {

    public void start(Stage stage) throws Exception {
        
        VBox main = new VBox();
        
        
        Label label = new Label();
        label.setText("Counter: ...");
        
        Button button = new Button("Click Me!");
        
        CheckBox checkbox = new CheckBox("Raufzählen");
        
        button.setOnAction(new EventHandler<ActionEvent>() {
            private int counter;
            public void handle(ActionEvent event) {
                // if-Anweisung, checkbox.isChecked()
                if(!checkbox.isSelected()) {
                    label.setText("Clicks: " + (counter ++));
                } else {
                    label.setText("Clicks: " + (counter --));
                }
            }
        });
        
        checkbox.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if(checkbox.isSelected()) {
                    checkbox.setText("Runterzählen");
                } else {
                    checkbox.setText("Raufzählen");
                }
            }
        });
        
        // Buttons lassen sich zusammen auswählen, wenn sie einen kontext haben
        RadioButton buttonA = new RadioButton();
        RadioButton buttonB = new RadioButton();
        
        ToggleGroup group = new ToggleGroup();
        buttonA.setToggleGroup(group);
        buttonB.setToggleGroup(group);
        
        boolean selected = buttonA.isSelected();
        // RadioButton extends ToggleButton
        // ToggleButton implements Toggle
        Toggle toggle = group.getSelectedToggle();
        if(toggle == buttonA) { }
        
        
        TextField text = new TextField();
        Label label2 = new Label();
        Button button2 = new Button("Ok");
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                String text2 = text.getText();
                label2.setText("Ergebnis: " + text2);
                
            }
        });
        
        List<Node> children = main.getChildren();
        children.add(label);
        children.add(button);
        children.add(checkbox);
        children.add(buttonA);
        children.add(buttonB);
        children.add(text);
        children.add(label2);
        children.add(button2);
        
        Scene scene = new Scene(main, 300, 200);
        
        stage.setTitle("Titel!!!1");
        stage.setScene(scene);
        stage.show();
    }

}

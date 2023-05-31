package lecture20230525.chapter09;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MoreExamples extends Application {

    public void start(Stage stage) throws Exception {
        
        Pane main = new VBox();
        
        
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
        
        
        TextField text = new TextField();
        Label label2 = new Label();
        Button button2 = new Button("Ok");
        
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                
                String text2 = text.getText();
                label2.setText("Ergebnis: " + text2);
                
            }
        });
        
        List<Person> test = new ArrayList<>();
        ObservableList<Person> list = 
                FXCollections.observableArrayList(test);
        ChoiceBox<Person> choiceBox = new ChoiceBox<>();
        choiceBox.setItems(list);
        choiceBox.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Click!");
                Person person = choiceBox.getSelectionModel().getSelectedItem();
                System.out.println("Auswahl: " + person);
            }
        });
        
        Button button3 = new Button("Test!");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            private int counter = 0;
            public void handle(ActionEvent event) {
                list.add(new Person("Person " + (counter ++)));
            }
        });
        
        
        List<Node> children = main.getChildren();
        
        BorderPane childPane = new BorderPane();
//        ObservableList<Node> children2 = childPane.getChildren();
        
        childPane.setCenter(label);
        childPane.setRight(button);
        
        FlowPane subPane = new FlowPane();
        childPane.setBottom(subPane);
        
//        children2.add(label);
//        children2.add(button);
        
        for(int i = 0; i < 10; i ++) {
            subPane.getChildren().add(new Button("Test: " + i));
        }
        
        children.add(childPane);
        children.add(checkbox);
        children.add(buttonA);
        children.add(buttonB);
        children.add(text);
        children.add(label2);
        children.add(button2);
        children.add(choiceBox);
        children.add(button3);
        
        Scene scene = new Scene(main, 300, 200);
        
        stage.setTitle("Titel!!!1");
        stage.setScene(scene);
        stage.show();
    }

}

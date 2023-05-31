package lecture20230531.chapter09.restaurant.ui;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lecture20230531.chapter09.restaurant.model.Article;
import lecture20230531.chapter09.restaurant.model.Reservation;
import lecture20230531.chapter09.restaurant.model.Table;

public class TableManager extends Application {
    
    private ArrayList<Table> tables;
    private ArrayList<Article> articles;
    private Label tableName;
    private ListView<Reservation> reservations;
    private ListView<String> bill;
    private ChoiceBox<Article> selectArticle;
    private TextField dateField;
    private TextField nameField;
    private Button addReservation;
    private Button addArticle;
    
    // State of current selection
    private Table current;

    public void init() throws Exception {
        this.tables = new ArrayList<>();
        this.articles = new ArrayList<>();
        
        for(int i = 0; i < 10; i ++) {
            this.tables.add(new Table(i));
        }
        
        this.articles.add(new Article("Pizza Diavolo", 12.99));
        this.articles.add(new Article("Pizza Margherita", 9.99));
        this.articles.add(new Article("Spagetthi Carbonara", 8.99));
        this.articles.add(new Article("Lasagne Bolognese", 9.99));
        this.articles.add(new Article("Rotwein Chianti 0,75l", 14.99));
        this.articles.add(new Article("Gemischter Salat", 4.99));
    }

    public void refreshUi() {
        if(current == null) {
            reservations.setDisable(true);
            bill.setDisable(true);
            addReservation.setDisable(true);
            dateField.setDisable(true);
            nameField.setDisable(true);
            addArticle.setDisable(true);
            selectArticle.setDisable(true);
            
            tableName.setText("---");
            reservations.getItems().clear();
            bill.getItems().clear();
        } else {
            reservations.setDisable(false);
            bill.setDisable(false);
            addReservation.setDisable(false);
            dateField.setDisable(false);
            nameField.setDisable(false);
            addArticle.setDisable(false);
            selectArticle.setDisable(false);
            
            tableName.setText(current.toString());
            
            List<Reservation> reservation = new ArrayList<>();
            for(Reservation res : current.getReservations()) {
                reservation.add(res);
            }
            reservations.setItems(FXCollections.observableList(reservation));
            
            List<String> billContent = new ArrayList<>();
            for(Article res : current.getArticle()) {
                int count = current.getArticleCount(res);
                billContent.add(count + "x " + res.toString());
            }
            bill.setItems(FXCollections.observableList(billContent));
            // ...
        }
    }
    
    public void start(Stage primaryStage) throws Exception {
        tableName = new Label();
        reservations = new ListView<>();
        bill = new ListView<>();
        selectArticle = new ChoiceBox<>(); // <-
        selectArticle.setItems(FXCollections.observableArrayList(this.articles));
        
        dateField = new TextField();
        nameField = new TextField();
        addReservation = new Button("Add");
        addArticle = new Button("Add");
        
        // Schleife für Tische, Tische erstellen und merken
        FlowPane tableButtons = new FlowPane();
        for(Table table : this.tables) {
            Button button = new Button(table.toString());
            tableButtons.getChildren().add(button);
            button.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    // ->
                    current = table;
                    refreshUi();
                }
            });
        }
        
        // Layout
        // -> struktur
        HBox main = new HBox();
        VBox tableView = new VBox();
        HBox addReservationBox = new HBox();
        HBox addArticleBox = new HBox();
        
        // Verknüpfen?
        main.getChildren().addAll(tableButtons, tableView);
        tableView.getChildren().addAll(tableName, reservations, addReservationBox, bill, addArticleBox);
        addReservationBox.getChildren().addAll(dateField, nameField, addReservation);
        addArticleBox.getChildren().addAll(selectArticle, addArticle);
        
        // EventHandling
        // -> table selected
        
        
        // -> reservation add
        addReservation.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String date = dateField.getText();
                String name = nameField.getText();
                if(date.isEmpty() || name.isEmpty()) {
                    return;
                }
                current.addReservation(new Reservation(date, name));
                refreshUi();
                
                dateField.setText("");
                nameField.setText("");
            }
        });
        
        // -> article add
        addArticle.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // was ist aktuell ausgewählt in der ChoiceBox?
                // -> get Current
                SingleSelectionModel<Article> model = selectArticle.getSelectionModel();
                
                Article item = model.getSelectedItem();
                if(item != null) {
                    current.addToBill(item);
                }
                refreshUi();
            }
        });
        
        
        refreshUi();
        
        Scene scene = new Scene(main);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}

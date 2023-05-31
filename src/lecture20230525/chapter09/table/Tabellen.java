package lecture20230525.chapter09.table;

import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class Tabellen extends Application {
	private TextArea protokollTextArea = new TextArea();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private Node initTabellenPane() {
		FlowPane pane = new FlowPane();
		pane.setHgap(20); // Abstand setzen
		// Hintergrundfarbe als CSS Style setzen
		pane.setStyle("-fx-background-color: lightgrey");

		/*
		 * Daten erzeugen
		 */
		List<Obst> obstkorb = Arrays.asList(
				new Obst("Birne", "gelb", 150, 0),
				new Obst("Apfel", "grün", 100, 2),
				new Obst("Kirsche", "rot", 2, 4));
		ObservableList<Obst> liste = FXCollections.observableArrayList(obstkorb);
		
		/*
		 * TableView erzeugen und Daten setzen
		 */
		TableView<Obst> tableView = new TableView<>(liste);
		tableView.setItems(liste);

		/*
		 * Spalten definieren und der tableView bekannt machen
		 */
        TableColumn bezeichnungColumn = new TableColumn("Bezeichnung");
		bezeichnungColumn.setCellValueFactory(
				new PropertyValueFactory<Obst, String>("bezeichnung"));
		
		TableColumn farbeColumn = new TableColumn("Farbe");
		farbeColumn.setCellValueFactory(
				new PropertyValueFactory<Obst, String>("farbe"));
		
		TableColumn gewichtColumn = new TableColumn("Gewicht[gr]");
		gewichtColumn.setCellValueFactory(
				new PropertyValueFactory<Obst, Integer>("gewichtInGramm"));
		
		TableColumn alterColumn = new TableColumn("Alter[Tage]");
		alterColumn.setCellValueFactory(
				new PropertyValueFactory<Obst, Integer>("alter"));
		
		tableView.getColumns().addAll(bezeichnungColumn, farbeColumn, gewichtColumn, alterColumn);

		/*
		 * die Tabelle soll editierbar sein
		 * 1. editable auf true setzen
		 * 2. für jede Spalte eine CellFactory setzen, die für den Editier-
		 * 	  Vorgang die Datenkonvertierung Attribut-Typ -> Text und 
		 *    beim Verlassen der Zelle Text -> Attribut-Typ vornimmt
		 * Für String-Attribute ist gibt es das vordefiniert(z.B. bezeichnungColumn),
		 * für andere (z.B. gewichtColumn) definieren wird den StringConverter selbst...
		 */
        tableView.setEditable(true);
        bezeichnungColumn.setEditable(false);
        farbeColumn.setEditable(false);
        gewichtColumn.setEditable(false);

        // nur die Alter-Spalte ist editierbar
        alterColumn.setCellFactory(TextFieldTableCell.forTableColumn(
    		new StringConverter<Integer>() {
				public Integer fromString(String s) {
					return Integer.valueOf(s);
				}
				public String toString(Integer i) {
					return "" + i;
				}        			
    		}));

// Was passiert, nachdem der Benutzer <enter> gedrückt hat beim Editieren:
// wir speichern den neuen Wert im Alter-Attribut
//        mit anonymer Klasse:
//        alterColumn.setOnEditCommit(
//        	    new EventHandler<CellEditEvent<Obst, Integer>>() {
//        	        @Override
//        	        public void handle(CellEditEvent<Obst, Integer> event) {
//        	        	int rowIndex = event.getTablePosition().getRow();
//        	            Obst obst = event.getTableView().getItems().get(rowIndex);
//        	            obst.setAlter(event.getNewValue());
//        	        }
//        	    }
//        	);
        // hier mit Lambda:
        alterColumn.setOnEditCommit(e -> {
        	CellEditEvent<Obst, Integer> event = (CellEditEvent<Obst, Integer>) e; 
        	int rowIndex = event.getTablePosition().getRow();
            Obst obst = event.getTableView().getItems().get(rowIndex);
            obst.setAlter(event.getNewValue());        	
        });
        
        /*
         * Mehrfach-Selektion setzen und Handler für Zeilenselektion mit Maus
         * installieren
         */
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        tableView.setOnMouseClicked(e -> {
        	protokollTextArea.setText( 
				tableView.getSelectionModel().getSelectedItems() + 
				"\n" + protokollTextArea.getText());
        });
        
        Button ausgabeButton = new Button("Tabelle ausgeben");
        ausgabeButton.setOnAction(event -> {
        	String ausgabe = "";
        	for (Obst obst: liste) {
        		ausgabe += obst.toString() + "\n";
        	}
        	protokollTextArea.setText(ausgabe);
        });

        pane.getChildren().addAll(new Label("TableView: "), tableView, ausgabeButton);
		return pane;
	}

	public void start(Stage primaryStage) throws Exception {
		VBox vertikalBox = new VBox();
		vertikalBox.setSpacing(10);
		primaryStage.setTitle("Tabellen-Demo");
		vertikalBox.getChildren().addAll(initTabellenPane(), protokollTextArea);
		primaryStage.setScene(new Scene(vertikalBox, 600, 620));
		primaryStage.show();
	}
}
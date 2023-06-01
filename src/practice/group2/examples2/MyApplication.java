package practice.group2.examples2;
import java.net.URL;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import studiplayer.basic.BasicPlayer;

abstract class AudioFile {
    private String pathname;

    public AudioFile(String pathname) { // <- exception?
        this.pathname = pathname;
    }
    
    public String getPathname() {
        return pathname;
    }
    
    public abstract void play();
    public abstract void stop();
}

class TaggedFile extends AudioFile {

    public TaggedFile(String pathname) {
        super(pathname);
    }

    public void play() {
        //BasicPlayer.play(getPathname());
    }

    public void stop() {
        //BasicPlayer.stop();
    }

}


public class MyApplication extends Application {
    
    // PlayList pl
    
    boolean stopped;
    AudioFile af = new TaggedFile("audiofiles/Rock 812.mp3");
    private Label label;
    
    private class PlayerThread extends Thread {
        public PlayerThread() {
            super("Player");
        }
        public void run() {
            // <- hier algorithmik, die parallel ausgeführt wird!
            while(!stopped) {
                // af = pl.getCurrentAudioFile()
                af.play();
                // aendern auf das nächste lied, wenn nicht gestoppt
                if(!stopped) {
                    // pl.???
                }
            }
        }
    }
    
    private class TimerThread extends Thread {
        int counter = 0;
        
        public TimerThread() {
            super("Timer");
        }
        public void run() {
            // wann passiert der Fehler?
            // -> wenn sie direkt mit GUI-Elementen arbeiten
            // -> wenn sie indirekt auf GUI-Elemente änderungen platzieren
            //    -> refreshUI
            
            while(!stopped) {
                Platform.runLater(() -> {
                    // <- logik hinterlegen
                    label.setText("Counter: " + (counter ++));
                });
                
                try {
                    Thread.sleep(1000); //ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    // Hinweis:
    // -> loadFromM3u
    // -> was passiert wenn pathname == null ist
    // -> ist der Reset korrekt?
    // -> this.clear(), od. Schleife die alle Elemente löscht
    // -> currentPosition int für aktuelle position in der linkedlist -> aktuell abgespieltes Lied
    // -> PlayList mit 10 Elementen ... spielen diese bis Pos. 9 ab
    //    -> anschließend loadFromM3U mit Datei die drei Lieder enthält
    //    -> currentPosition ist noch 9!
    //    -> getCurrentAudioFile() -> get(9)
    // -> BugFix -> currentPosition = 0
    
    public void start(Stage primaryStage) throws Exception {
        
        VBox main = new VBox();
        label = new Label("...");
        Button button = createButton("play.png");
        Button button2 = createButton("stop.png");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
//                PlayerThread playerThread = new PlayerThread();
//                playerThread.setDaemon(true);
//                playerThread.start();
                
                new PlayerThread().start();
                new TimerThread().start();
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                stopped = true;
                
                af.stop();
            }
        });
//        button.setOnAction((event) -> {
//            
//        });
        
        main.getChildren().addAll(label, button, button2);
        
        Parameters parameters = getParameters();
        List<String> raw = parameters.getRaw();
        String playlistPathname = raw.get(0);
        // todo if zzgl. playlist erzeugung
        
        Scene scene = new Scene(main, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createButton(String name) {
        URL resource = getClass().getResource("/icons/" + name);
        Image image = new Image(resource.toString());
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(48);
        imageView.setFitWidth(48);
        Button button = new Button("", imageView);
        return button;
    }

    public static void main(String[] args) {
        launch(args);
    }


}

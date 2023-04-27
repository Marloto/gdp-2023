package practice.group2.examples;
import org.junit.Test;

public class TestAudioFile {
    
    // Parallele Ausführungen
    public void playHelper(AudioFile af) {
        new Thread(() -> af.play()).start();
    }
    // Warten bis Zeit vergangen ist
    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch(Exception e) {}
    }
    
    @Test
    public void testPlay() {
        AudioFile file = new AudioFile("audiofiles/Rock 812.mp3");
        playHelper(file);
        wait(2);
        file.stop();
        System.out.println("Nächste Zeile!");
    }
}

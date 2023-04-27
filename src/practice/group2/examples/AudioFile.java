package practice.group2.examples;

//import studiplayer.basic.BasicPlayer;

public class AudioFile {
    private String pathname;
    public AudioFile(String pathname) {
        this.pathname = pathname;
    }
    
    public String getPathname() {
        return pathname;
    }
    
    public void play() {
//        BasicPlayer.play(this.getPathname());
    }
    
    public void stop() {
//        BasicPlayer.stop();
    }
}

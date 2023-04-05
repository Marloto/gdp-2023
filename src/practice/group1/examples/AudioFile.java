package practice.group1.examples;


public class AudioFile {
    public AudioFile() {
    }
    
    public void parsePathname(String path) {
        // fancy changes...
    }
    
    public String getPathname() {
        return "";
    }
    
    public static void main(String[] args) {
        AudioFile audio1 = new AudioFile();
        audio1.parsePathname("");
        String pathname = audio1.getPathname();
        System.out.println(pathname);
        
        AudioFile audio2 = new AudioFile();
        audio2.parsePathname("file.mp3");
        String pathname2 = audio2.getPathname();
        System.out.println(pathname2);
    }
}

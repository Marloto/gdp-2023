package practice.group2.examples;
import java.io.File;

public class Example {
    public static void main(String[] args) {
        // File
        // Exception
        String pathname = "audiofiles/Rock 812.mp3";
        File file = new File(pathname);
        // file.exists()
//        file.canExecute();
//        file.canRead();
//        file.canWrite();
        
        if(file.canRead()) {
            System.out.println("Existiert!");
        } else {
            System.out.println("Existiert nicht!");
        }
        
        if(!file.canRead()) {
            throw new RuntimeException("File existiert nicht: " + file.getName());
        }
        
        // Blocking Calls -> Test-Probleme
//        BasicPlayer.play(pathname);
        // System.out.println("Finish!");
        
        
        // Map: String Schlüssel auf Wert mit beliebigen Datentyp gemappet
        //Map<String, Object> readTags = TagReader.readTags(pathname);
        
        
        
//        Set<String> keySet = readTags.keySet();
//        readTags.containsKey("");
//        readTags.get("");
        
        
//        for(String key: readTags.keySet()) { // <-- alle keys
//            Object object = readTags.get(key); // <-- für jeden cast auf String
//            System.out.println(key + ": " + object.toString() + " > " + object.getClass().getName());
//        }
        
//        Object album = readTags.get("album");
        // ggf. prüfen ob != null bzw. ! ....equals("")
//        System.out.println("Album: " + album);
    }
}

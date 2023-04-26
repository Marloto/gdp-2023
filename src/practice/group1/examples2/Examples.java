package practice.group1.examples2;
import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Hinweis: im Repo gibt es kein BasicPlayer / TagReader, daher vorerst auskommentiert

//import studiplayer.basic.BasicPlayer;
//import studiplayer.basic.TagReader;

class AudioFile {
    private String pathname;
    public AudioFile(String pathname) {
        this.pathname = pathname;
        // parsePathname
        // parseFilename
        String pathname2 = getPathname();
        // ^ welcher datentyp?
        //   -> den selben Typ
        //   -> etwas in der Vererbung
        //   -> auto. Object
        //   -> od. Interface
        
        File file = new File(this.getPathname());
        if(!file.canRead()) {
            throw new RuntimeException("Konnte nicht finden: " + file.getName());
        }
    }
    
    
    public String getPathname() {
        return pathname;
    }
    
    // abstrakte play-Methode
}

public class Examples {
    public static void main(String[] args) {
        // [x] File
        AudioFile audioFile = new AudioFile("audiofiles/Rock 812.mp3");
        // [x] Exception
        
        // [x] Lied abspielen
        //BasicPlayer.play(audioFile.getPathname());
        
        // Map
//        Map<String, Object> readTags = TagReader.readTags("audiofiles/Rock 812.mp3");
//        Set<Entry<String, Object>> entrySet = readTags.entrySet();
//        Set<String> keySet = readTags.keySet();
        
        // Iteration über alle Einträge
//        for(Entry<String, Object> entry: readTags.entrySet()) {
//            String key = entry.getKey();
//            Object value = entry.getValue();
//        }
        
//        String album = "";
//        long duration = 0;
//        for(String key: readTags.keySet()) {
//            Object value = readTags.get(key);
//            if(value != null && value.equals("")) {
//                if(key.equals("album")) {
//                    if(value instanceof String) {
//                        album = (String) value;
//                    }
//                } else if(key.equals("duration")) {
//                    if(value instanceof Long) {
//                        duration = ((Long) value).longValue();
//                    }
//                }
//            }
//            System.out.println(key + ": " + value + " > " + value.getClass().toString());
//            // -> album, title, author, duration
//        }
        
//        String album = readTags.containsKey("album") ? ((String) readTags.get("album")).trim() : "";
        
//        if(readTags.containsKey("album")) {
//            album = ((String) readTags.get("album")).trim();
//        }
//        System.out.println(album);
        
        long xyz = 2148000000L;
    }
}

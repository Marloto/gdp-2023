package lecture20230607.chapter10;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Message {
    private long time;
    private String message;
    public Message(long time, String message) {
        this.time = time;
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public long getTime() {
        return time;
    }
    
    public String toFormattedTime() {
        return "";
    }
    
    public String toString() {
        return this.time + " : " + this.message;
    }
    
}

public class MessageStream {
    private static Message last;

    public static void main(String[] args) {
        List<String> messages = Arrays.asList(
                "1581697831661:Message 1",
                "1581553746009:Message 2",
                "1588854263313:Message 3",
                "1588854263313",
                "1589381962905:Message 4",
                "1589379566771:Message 5");
        
        Stream<String> stream = messages.stream();
        stream
            .map((input) -> input.split(":")) // Intermediate-Operator: Stream<String[]>, i.R. zwei Elemente
            .filter((input) -> input.length >= 2)
            .map((input) -> new Message(Long.parseLong(input[0]), input[1]))
            .filter((input) -> last == null || last.getTime() < input.getTime())
            .peek(el -> last = el) // Intermediate-Operator: Stream<Message>
            .forEach(System.out::println);
//            .map((input) -> {
//                String[] split = input.split(":");
                  // ggf. length prüfen  
//                long valueOf = Long.parseLong(split[0]);
//                String message = split[1];
//                return new Message(valueOf, message);
//            });
    }
}

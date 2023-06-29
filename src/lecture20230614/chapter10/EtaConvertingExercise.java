package lecture20230614.chapter10;

import java.util.Scanner;

class Position {
    private int x, y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Position(String input) {
        String[] split = input.split(",");
        this.x = Integer.valueOf(split[0]);
        this.y = Integer.valueOf(split[1]);
    }
    
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public static Position fromString(String input) {
        String[] split = input.split(",");
        return new Position(
                Integer.valueOf(split[0]), 
                Integer.valueOf(split[0]));
    }
    public String toString() {
        return "Position [x=" + x + ", y=" + y + "]";
    }
}

interface Transformer {
    Position run(String input);
}

public class EtaConvertingExercise {
    private static void readAndPrint(Transformer transformer) {
        try (Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            Position run = transformer.run(line);
            System.out.println(run);
        };
    }
    
    public static void main(String[] args) {
        // readAndPrint((x) -> Position.fromString(x));
        readAndPrint(Position::fromString);
        
        // readAndPrint((x) -> new Position(x));
        readAndPrint(Position::new);
    }
}

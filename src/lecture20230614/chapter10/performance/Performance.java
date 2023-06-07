package lecture20230614.chapter10.performance;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Performance {
    private static final int N = 100000;

    public static void main(String[] args) {
        long start;
        long end;
        double resI, resAI, resL;
        
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(new OutputStream() {
            public void write(int b) throws IOException {}
        }));
        
        System.out.println("Start...");

        InnerClassCase.main(args); // dry run
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            InnerClassCase.main(args);
        }
        end = System.nanoTime();
        resI = (double) (end - start) / (double) N;

        AnonymousInnerClassCase.main(args); // dry run
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            AnonymousInnerClassCase.main(args);
        }
        end = System.nanoTime();
        resAI = (double) (end - start) / (double) N;

        LambdaCase.main(args); // dry run
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            LambdaCase.main(args);
        }
        end = System.nanoTime();
        resL = (double) (end - start) / (double) N;
        
        System.setOut(oldOut);

        System.out.println("Inner: " + resI);
        System.out.println("Anonym: " + resAI);
        System.out.println("Lambda: " + resL);

    }
}

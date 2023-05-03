package lecutre20230503.chapter06.collections;

public class Messwerkzeuge {
    protected static final int ITERATIONS = 10000;
    private static long time;

    private static Data[] objects = new Data[ITERATIONS];
    private static String[] datas = new String[ITERATIONS];
    private static StringBuilder output = new StringBuilder();
    
    static {
        for (int i = 0; i < ITERATIONS; i++) {
            objects[i] = new Data();
            datas[i] = "Data: " + objects[i].getValue();
        }
        Runtime.getRuntime()
            .addShutdownHook(
                new Thread(() -> 
                    System.out.println("------" + System.lineSeparator() + output)));
    }

    static Data dummy(int i) {
        return objects[i % objects.length];
    }

    static String dummyData(int i) {
        return datas[i % objects.length];
    }

    static void start() {
        time = System.nanoTime();
    }

    static void stopAndPrint(String msg) {
        long nanoTime = System.nanoTime();
        output.append(String.format(msg, (double) (nanoTime - time) / (double) ITERATIONS));
        output.append(System.lineSeparator());
    }

    protected static final class Data implements Comparable<Data> {
        private final int value;
        private final String msg;

        private Data() {
            this.value = (int) (Math.random() * 1000000.0);
            this.msg = new StringBuilder().append("Data[").append(value).append("]").toString();
        }

        public int getValue() {
            return value;
        }

        public int compareTo(Data o) {
            return Integer.compare(this.value, o.value);
        }

        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + value;
            return result;
        }

        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Data other = (Data) obj;
            if (value != other.value)
                return false;
            return true;
        }
        
        @Override
        public String toString() {
            return this.msg;
        }
    }

}
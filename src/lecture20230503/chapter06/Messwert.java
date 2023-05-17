package lecture20230503.chapter06;

public class Messwert<T> {
    private String name;
    private T value;
    
    public Messwert(String name, T value) {
        this.name = name;
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Messwert [name=" + name + ", value=" + value + "]";
    }
    
    
}

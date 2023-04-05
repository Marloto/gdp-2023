package lecture20230405.chapter02.getterandsetter;

public class GetterAndSetter2 {
    public static void main(String[] args) {
        GetterAndSetter inst = new GetterAndSetter();
        
        inst.setXyz(42);
        
        System.out.println(inst.getXyz());
    }
}

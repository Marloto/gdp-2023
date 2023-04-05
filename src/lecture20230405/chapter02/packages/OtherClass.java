package lecture20230405.chapter02.packages;

import lecture20230405.chapter02.packages.somepackage.SomeClass;

public class OtherClass {
    public static void main(String[] args) {
        SomeClass var = new SomeClass();
        lecture20230405.chapter02.packages.otherpackage.SomeClass other = new lecture20230405.chapter02.packages.otherpackage.SomeClass();
    }
}

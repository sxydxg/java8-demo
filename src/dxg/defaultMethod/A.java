package dxg.defaultMethod;

public interface A {

    default void say(){
        System.out.println("A say !");
    }

    static void testStatic(){
        System.out.println("A static");
    }
}

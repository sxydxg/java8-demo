package dxg.defaultMethod;

public interface C {

    default void say(){
        System.out.println("C say!");
    }

    static void testStatic(){
        System.out.println("C static");
    }
}

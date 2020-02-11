package dxg.defaultMethod;

public interface B extends A {

    default void say(){
        //调用A的say
        A.super.say();
        System.out.println("B say!");
    }

    static void testStatic(){
        System.out.println("B static");
    }
}

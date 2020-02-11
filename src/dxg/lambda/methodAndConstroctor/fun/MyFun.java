package dxg.lambda.methodAndConstroctor.fun;

import dxg.lambda.methodAndConstroctor.People;

@FunctionalInterface
public interface MyFun {
    //Object也是可以的
//    Object getPeople(String name, int age);
//    People getPeople(String name, int age);
    //没有返回值也是可以的
    void getPeople(String name, int age);
}

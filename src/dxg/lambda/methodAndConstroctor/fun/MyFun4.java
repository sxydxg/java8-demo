package dxg.lambda.methodAndConstroctor.fun;

@FunctionalInterface
public interface MyFun4 {

//    void getArr(Integer num);    没有返回值也是可以的
    String [] getArr(Integer num);
//    String [] getArr(int num);  都可以，因为有自动拆箱和装箱
}

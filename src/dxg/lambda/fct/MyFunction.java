package dxg.lambda.fct;

/**
 *  函数式接口
 * @auther 丁溪贵
 * @date 2020/2/8
 */
@FunctionalInterface
public interface MyFunction {

    //抽象方法
    void hello();

    //默认方法1
    default void myDefaulMethod(){
        System.out.println("这是一个默认方法1");
    }
    //默认方法2
    default void myDefaulMethod2(){
        System.out.println("这是一个默认方法2");
    }
}

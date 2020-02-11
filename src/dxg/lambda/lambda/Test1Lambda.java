package dxg.lambda.lambda;

import dxg.lambda.lambda.fct.MyFunction;
import org.junit.Test;

/**
 * @auther 丁溪贵
 * @date 2020/2/8
 */
public class Test1Lambda {

    @Test
    public void test1(){

        //本质上可以当做是一个匿名内部类
        MyFunction myFunction = ()->{
            System.out.println("hello方法");
        };

        //抽象方法
        myFunction.hello();
        //默认方法
        myFunction.myDefaulMethod();
        //默认方法
        myFunction.myDefaulMethod2();
    }
}

package dxg.lambda.lambda;


import dxg.lambda.lambda.fct.*;
import org.junit.Test;

import java.util.function.BiPredicate;

/**
 * @auther 丁溪贵
 * @date 2020/2/8
 */
public class Test2Lambda {



    @Test
    public void style1(){
        //无参数 无返回值
        //写法1 标准写法
        StyleFun1 s1 = ()->{
            System.out.println("hello1");
        };
        //写法2
        StyleFun1 s2 = ()-> System.out.println("hello2");
        s1.hello();
        s2.hello();

    }

    @Test
    public void style2(){
        //有参数 无返回值
        //标准写法
        StyleFun2 s1 = (a1) ->{
            System.out.println(a1);
        };

        StyleFun2 s2 = a2->{
            System.out.println(a2);
        };

        StyleFun2 s3 = a3-> System.out.println(a3);
    }

    @Test
    public void style3(){
        //有参数 无返回值
        //标准写法
        StyleFun3 s1 = (a1,a2) ->{
            System.out.println(a1+a2);
        };
        StyleFun3 s2 = (a1,a2) -> System.out.println(a1+a2);

    }

    @Test
    public void style4(){
        //有参数 无返回值
        //标准写法
        StyleFun4 s1 = (a1, a2) ->{
            return a1+a2;
        };

        //只要一个语句，且改语句值return 语句，那么可以省略{}
        StyleFun4 s2 = (a1,a2)->a1+a2 ;


    }

    @Test
    public void style5(){
        //对象方法引用
        BiPredicate<String,String> bp = (x, y) -> x.equals(y);
        BiPredicate<String,String> bp1 = String::equals;

        boolean test = bp1.test("xy", "xx");
        //对象方法引用，第一个参数为调用者，第二个参数为为调用者的参数
        StyleFun5<Student,String> styleFun5 = Student::stu;
        //或则只有一个参数 ,则第一个参数为调用者，无参数
        StyleFun6 styleFun6 = Student::stu2;


    }
}

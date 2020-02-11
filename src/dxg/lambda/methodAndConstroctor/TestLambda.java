package dxg.lambda.methodAndConstroctor;

import dxg.lambda.methodAndConstroctor.fun.*;
import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 *
 *   方法和构造器引用
 *
 *   要求：函数接口方法要与目标方法的参数和返回值要一致()
 *
 *    左边参数是右边获取方法引用的子类即可
 *    Consumer<String> c3 = new People()::say;
 *
 *    好比是
 *    accept(String str){
 *       //peple的参数要求Object，你传一个String当然可以了，如果参数类型反过则会编译报错。
 *        people.say(str);
 *    }
 *
 */
public class TestLambda {


   @Test
   public void test1(){
       //实例对象方法
       Consumer<String> c1 = (a)-> System.out.println(a);
       c1.accept("hello");
       //
       Consumer<String> c2 = System.out::println;
       c2.accept("haha");
       //测试子类是否可以
       Consumer<String> c3 = new People()::say;
       c3.accept("你好！");
   }

   @Test
   public void test2(){
      //构造器引用
     //构造器引用方法参数要一致，返回值不做要求

       Supplier<People> supplier = People::new ;
       MyFun myFun = People::new;
       //每次调用都参数一个新的对象
//       System.out.println(myFun.getPeople("",0)==myFun.getPeople("",0));
        myFun.getPeople("",0);

   }


   @Test
   public void test3(){
        //类的静态引用
       MyFun2 myFun2 = People::add;
       int res = myFun2.add(new People("", 10), new People("", 20));
       System.out.println(res);


   }

   @Test
   public void test(){

       //类的静态方法引用
       MyFun3 myFun3 = People::haha;
       myFun3.haha();


   }

   //数组引用
   public void test5(){

       MyFun4 myFun4 = String[]::new;


   }

}

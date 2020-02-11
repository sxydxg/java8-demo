package dxg.defaultMethod;

import sun.applet.Main;

/**
 * @auther 丁溪贵
 * @date 2020/2/8
 * 测试默认方法
 *
 */
public class TestDefaultMethod  {

    public static class T1 implements A{

    }

    public static class T2 implements B{

    }

    //编译不能通过
    public static class T3 implements A,C{


        @Override
        public void say() {

            A.super.say();
            C.super.say();
        }
    }
    public static void main(String[] args) {
        T1 t1 = new T1();
//        t1.say();
        B.testStatic();
        T2 t2 = new T2();
//        t2.say();

    }
}

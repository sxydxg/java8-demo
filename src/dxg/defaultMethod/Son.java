package dxg.defaultMethod;

/**
 * @auther 丁溪贵
 * @date 2020/2/8
 */
public class Son extends Parent {

    public static void main(String[] args) {
        //通过子类可以访问到父类的静态方法
        Son.hello();
    }
}

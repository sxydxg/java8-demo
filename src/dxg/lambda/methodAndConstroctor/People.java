package dxg.lambda.methodAndConstroctor;

/**
 * @auther 丁溪贵
 * @date 2020/2/9
 */

public class People {

    private String name ;
    private int age ;

    public People() {
    }

    public People(String name, int age) {
        System.out.println(this);
        this.name = name;
        this.age = age;
    }

    public void say(Object say){
        System.out.println("people say "+say);
    };

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  int add(People people){
        return this.age+people.age;
    }

    public static void haha(){
        System.out.println("haha");
    }



}

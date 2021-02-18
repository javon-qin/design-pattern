package cn.javon.dp.single;

/**
 * 饿汉式
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void sayHello(){
        System.out.println("hello,world");
    }

}

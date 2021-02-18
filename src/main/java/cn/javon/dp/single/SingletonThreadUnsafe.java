package cn.javon.dp.single;

/**
 * 懒汉式，线程不安全
 */
public class SingletonThreadUnsafe {

    private static SingletonThreadUnsafe instance;

    private SingletonThreadUnsafe(){}

    public static SingletonThreadUnsafe getInstance(){
        if (null == instance){
            instance = new SingletonThreadUnsafe();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello,world");
    }

}

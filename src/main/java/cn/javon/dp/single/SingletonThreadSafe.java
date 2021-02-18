package cn.javon.dp.single;

/**
 * 懒汉式，线程安全
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){}

    public synchronized static SingletonThreadSafe getInstance(){
        if (null == instance){
            instance = new SingletonThreadSafe();
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello,world");
    }

}

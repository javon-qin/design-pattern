package cn.javon.dp.single;

/**
 * 双重校验锁式
 */
public class SingletonDoubleCheck {

    private static SingletonDoubleCheck instance;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance(){
        if (null == instance){
            synchronized (SingletonDoubleCheck.class){
                if (null == instance){
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

    public void sayHello(){
        System.out.println("hello,world");
    }

}

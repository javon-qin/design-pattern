package cn.javon.dp.single;

/**
 * 内部类式
 */
public class SingletonInner {

    private static class SingletonHolder {
        private static final SingletonInner INSTANCE = new SingletonInner();
    }

    private SingletonInner() {}

    public static final SingletonInner getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

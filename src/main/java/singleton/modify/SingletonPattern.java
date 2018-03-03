package singleton.modify;

public class SingletonPattern {
    private static SingletonPattern singletonPattern = null;

    // 限制住不能直接产生一个实例
    private SingletonPattern() {

    }

    /**
     * 当两个线程同时访问到if判断那一行代码时会出现两个线程都能执行if代码块
     *
     * 所以就造成了单例不再单例了，就会被创建两个实例对象
     * @return
     */
    public SingletonPattern getInstance() {
        if(this.singletonPattern == null) {
            this.singletonPattern = new SingletonPattern();
        }
        return this.singletonPattern;
    }
}

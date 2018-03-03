package singleton3;

/**
 * 通用单例模式
 */
public class SingletonPatternModify {
    private static final SingletonPatternModify singletonPatternModify = new SingletonPatternModify();

    private SingletonPatternModify() {
    }

    /**
     * 个人觉得此处没必要加synchronized关键字
     * @return
     */
    public synchronized static SingletonPatternModify getInstance() {
        return singletonPatternModify;
    }
}

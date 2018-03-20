package other.singleton;

public class SerSingleton implements java.io.Serializable {
    String name;

    private SerSingleton() {
        System.out.println("Singleton is create");
        name = "SerSingleton";
    }

    private static SerSingleton instance = new SerSingleton();
    public static SerSingleton getInstance() {
        return instance;
    }

    public static void createString() {
        System.out.println("createString in Singleton");
    }

    /**
     * 删除以下代码，则test测试失败
     * @see other.singleton.SerSingletonTest
     * @return
     */
    private Object readResolve(){
        return instance;
    }
}

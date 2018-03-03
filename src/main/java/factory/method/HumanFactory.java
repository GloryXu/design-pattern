package factory.method;

import java.lang.reflect.InvocationTargetException;

public class HumanFactory {

    public static Human createHuman(Class c) {
        Human human = null;// 定义一个类型的人类

        try {
            human = (Human) c.getDeclaredConstructor(null).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return human;
    }
}

package chapter05.factory.method.advance;

import chapter05.factory.method.Human;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class HumanFactory {
    // 定义一个MAP，初始化过的Human对象都放在这里
    private static HashMap<String, Human> humans = new HashMap<String, Human>();

    // 定一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null;// 定义一个类型的人类
        try {
            // 如果MAP中有，则直接从中取出，不用初始化
            if(humans.containsKey(c.getSimpleName())){
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) c.getDeclaredConstructor(null).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (IllegalAccessException e) {
            System.out.println("人类定义错误");
        } catch (InstantiationException e) {
            System.out.println("实例化异常");
        } catch (NoSuchMethodException e) {
            System.out.println("构造方法不存在");
        } catch (InvocationTargetException e) {
            System.out.println("映射异常");
        }
        return human;
    }
}

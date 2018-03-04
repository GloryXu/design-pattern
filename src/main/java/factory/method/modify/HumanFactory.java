package factory.method.modify;

import factory.method.Human;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class HumanFactory {
    // 定义一个烤箱，泥巴塞进去，人就出来，这个太先进了
    public static Human createHuman(Class c) {
        Human human = null;// 定义一个类型的人类
        try {
            human = (Human) c.getDeclaredConstructor(null).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return human;
    }

    // 女娲生气了，把一团泥巴塞到八卦炉，爱生产啥人类就啥人类
    public static Human createHuman() {
        Human human = null;
        List<Class> concretHumanList = ClassUtils.getAllClassByInterface(Human.class);// 定义了多少人类
        // 八卦炉自己开始想烧出什么人就什么人
        Random random = new Random();
        int rand = random.nextInt(concretHumanList.size());

        human = createHuman(concretHumanList.get(rand));

        return human;
    }



}

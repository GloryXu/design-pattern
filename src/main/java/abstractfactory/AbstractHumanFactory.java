package abstractfactory;

import java.lang.reflect.InvocationTargetException;

public abstract class AbstractHumanFactory implements HumanFactory {

    protected Human createHuman(HumanEnum humanEnum) {
        Human human = null;

        // 如果传递进来不是一个Enum中的一个Element的话，则不处理
        if(!"".equals(humanEnum.getValue())) {
            try{
                // 直接产生一个实例
                human = (Human) Class.forName(humanEnum.getValue()).getDeclaredConstructor(null).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return human;
    }
}

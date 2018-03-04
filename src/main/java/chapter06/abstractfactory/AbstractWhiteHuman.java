package chapter06.abstractfactory;

public abstract class AbstractWhiteHuman implements Human {
    public void laugh() {
        System.out.println("白种人类会大小，幸福呀！");
    }

    public void cry() {
        System.out.println("白种人来会大哭");
    }

    public void talk() {
        System.out.println("白种人类会说话");
    }
}

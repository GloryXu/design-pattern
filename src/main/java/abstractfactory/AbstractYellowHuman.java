package abstractfactory;

public abstract class AbstractYellowHuman implements Human {
    public void laugh() {
        System.out.println("黄种人类会大小，幸福呀！");
    }

    public void cry() {
        System.out.println("黄种人来会大哭");
    }

    public void talk() {
        System.out.println("黄种人类会说话");
    }
}

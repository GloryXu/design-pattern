package factory.method;

public class YellowHuman implements Human {
    public void laugh() {
        System.out.println("黄色人类会笑");
    }

    public void cry() {
        System.out.println("黄色人类会哭");
    }

    public void talk() {
        System.out.println("黄人人类会说话，一般说的都是双字节");
    }
}

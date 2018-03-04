package chapter05.factory.method;

public class BlackHuman implements Human {
    public void laugh() {
        System.out.println("黑色人类会大笑");
    }

    public void cry() {
        System.out.println("黑色人类会哭");
    }

    public void talk() {
        System.out.println("黑色人类可以说话，一般人听不懂");
    }
}

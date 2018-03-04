package chapter05.factory.method;

public class NvWaMain {
    public static void main(String[] args) {
        System.out.println("----------造出的第一批人是这样的：白人---------");

        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("----------造出的第一批人是这样的：黑人---------");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("----------造出的第一批人是这样的：黄人---------");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();
    }
}

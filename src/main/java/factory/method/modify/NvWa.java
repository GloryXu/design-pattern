package factory.method.modify;

import factory.method.BlackHuman;
import factory.method.Human;
import factory.method.WhiteHuman;
import factory.method.YellowHuman;

public class NvWa {
    public static void main(String[] args) {
        System.out.println("造出的第一批人是这样的：白人");
        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.cry();
        whiteHuman.laugh();
        whiteHuman.talk();

        System.out.println("造出的第一批人是这样的：黑人");
        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.cry();
        blackHuman.laugh();
        blackHuman.talk();

        System.out.println("造出的第一批人是这样的：黄色人类");
        Human yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.cry();
        yellowHuman.laugh();
        yellowHuman.talk();



        for(int i = 0;i<1000000000;i++) {
            System.out.println("随机产生人类了");
            Human human = HumanFactory.createHuman();
            human.cry();
            human.laugh();
            human.talk();
        }
    }
}

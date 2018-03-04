package chapter06.abstractfactory;

public class FemaleHumanFactory extends AbstractHumanFactory {
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YellowFeMaleHuman);
    }

    public Human createWhiteHuman() {
        return super.createHuman(HumanEnum.WhiteFeMaleHuman);
    }

    public Human createBlackHuman() {
        return super.createHuman(HumanEnum.BlackFeMaleHuman);
    }
}

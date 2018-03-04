package abstractfactory;

public class NvWaMain {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleHumanFactory();

        HumanFactory femaleHumanFactory = new FemaleHumanFactory();

        Human maleYellowHuman = maleHumanFactory.createYellowHuman();

        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();

        maleYellowHuman.cry();
        maleYellowHuman.sex();
        femaleYellowHuman.laugh();
        femaleYellowHuman.sex();
    }
}

package chapter06.abstractfactory;

public enum HumanEnum {
    YellowMaleHuman("abstractfactory.YellowMaleHuman"),
    YellowFeMaleHuman("abstractfactory.YellowFemaleHuman"),
    WhiteMaleHuman("abstractfactory.WhiteMaleHuman"),
    WhiteFeMaleHuman("abstractfactory.WhiteFemaleHuman"),
    BlackMaleHuman("abstractfactory.BlackMaleHuman"),
    BlackFeMaleHuman("abstractfactory.BlackFemaleHuman");

    private String value = "";

    HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

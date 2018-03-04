package chapter07.facade;

public class ClientAdvance {
    public static void main(String[] args) {
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();

        String address = "hahah Road";

        String context = "ni hao a!";

        hellRoadPostOffice.sendLetter(context, address);
    }
}

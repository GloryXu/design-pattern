package chapter09.template.method;

public class Client {

    public static void main(String[] args) {
        /*//客户开着H1型号，出去遛弯了
        HummerModel h1 = new HummerH1Model();
        h1.run(); //汽车跑起来了；
        //客户开H2型号，出去玩耍了
        HummerModel h2 = new HummerH2Model();
        h2.run();*/


        //客户开着H1型号，出去遛弯了
        HummerH1Model h1 = new HummerH1Model();
//        h1.setAlarm(true);
        h1.setAlarm(false);
        h1.run(); //汽车跑起来了；
    }

}

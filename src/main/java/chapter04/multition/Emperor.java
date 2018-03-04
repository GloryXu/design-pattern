package chapter04.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
    private static int maxNumOfEmperor = 2;// 最多只能有两个皇帝

    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);
    private static int countNumOfEmperor = 0;// 正在被人尊敬的是那个皇帝

    static {
        // 把所有的皇帝都生产出来
        for(int i = 0;i<maxNumOfEmperor;i++) {
            emperorList.add(new Emperor("皇" + ( i + 1) + "帝"));
        }
    }

    private Emperor() {}

    private Emperor (String info) {
        emperorInfoList.add(info);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return (Emperor) emperorList.get(countNumOfEmperor);
    }

    public static void emperorInfo() {
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }
}

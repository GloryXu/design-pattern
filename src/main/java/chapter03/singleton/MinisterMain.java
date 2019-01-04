package chapter03.singleton;

public class MinisterMain {

    public static void main(String[] args) {
        // 第一天
        Emperor emperor1 = Emperor.getInstance();
        Emperor.emperorInfo();// 第一天见的皇帝叫什么名字呢？

        // 第二天
        Emperor emperor2 = Emperor.getInstance();
        Emperor.emperorInfo();

        // 第三天
        Emperor emperor3 = Emperor.getInstance();
        Emperor.emperorInfo();

        // 三天见的皇帝都是同一个人
    }
}

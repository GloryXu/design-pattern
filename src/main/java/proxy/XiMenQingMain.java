package proxy;

public class XiMenQingMain {
    public static void main(String[] args) {
        // 把王婆叫出来
        WangPo wangPo = new WangPo();

        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();



        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMan();
        wangPo1.happyWithMan();
    }
}

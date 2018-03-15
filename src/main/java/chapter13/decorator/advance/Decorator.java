package chapter13.decorator.advance;

import chapter13.decorator.SchoolReport;

public abstract class Decorator extends SchoolReport {
    //首先我要知道是那个成绩单
    private SchoolReport sr;

    //构造函数，传递成绩单过来
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    //成绩单还是要被看到的
    public void report() {
        System.out.println(1111111);
        this.sr.report();
    }

    //看完毕还是要签名的
    public void sign(String name) {
        this.sr.sign(name);
    }
}

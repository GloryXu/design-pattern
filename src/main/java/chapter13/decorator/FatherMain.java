package chapter13.decorator;

public class FatherMain {
    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr = new FouthGradeSchoolReport();
        //看成绩单
        sr.report();
        //签名？休想！
    }
}

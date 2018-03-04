package chapter08.adapter;

public class AppMain {

    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for(int i = 0;i<101;i++) {
            youngGirl.getMobileNumber();
        }
    }
}

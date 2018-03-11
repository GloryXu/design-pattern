package chapter08.adapter;

import chapter08.adapter.in.IUserInfo;
import chapter08.adapter.in.UserInfo;
import chapter08.adapter.out.IOuterUser;

public class AppMain {

    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        for(int i = 0;i<101;i++) {
            youngGirl.getMobileNumber();
        }

        IOuterUser outerUser = new OuterUserInfo();
        IUserInfo outerUserInfoObject = new OuterUserInfoObject(outerUser);
        outerUserInfoObject.getHomeAddress();
        outerUserInfoObject.getHomeTelNumber();
        outerUserInfoObject.getJobPosition();
        outerUserInfoObject.getMobileNumber();
        outerUserInfoObject.getOfficeTelNumber();
        outerUserInfoObject.getUserName();

    }
}

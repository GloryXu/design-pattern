package adapter;

public class UserInfo implements IUserInfo {
    public String getUserName() {
        System.out.println("员工姓名为XXX");
        return null;
    }

    public String getHomeAddress() {
        System.out.println("员工家庭住址为XXX Road");
        return null;
    }

    public String getMobileNumber() {
        System.out.println("员工手机号为000");
        return null;
    }

    public String getOfficeTelNumber() {
        System.out.println("员工办公电话为0513-999999");
        return null;
    }

    public String getJobPosition() {
        System.out.println("员工工作职位为总监");
        return null;
    }

    public String getHomeTelNumber() {
        return null;
    }
}

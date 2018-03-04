package chapter08.adapter;

/**
 * 对象适配器
 */
public class OuterUserInfoObject implements IUserInfo {

    private IOuterUser outerUser;

    public OuterUserInfoObject(IOuterUser outerUser) {
        this.outerUser = outerUser;
    }

    /*
        * 家庭地址
        */
    public String getHomeAddress() {
        String homeAddress = outerUser.getUserHomeInfo().get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

   /*
    * 家庭电话号码
    */
    public String getHomeTelNumber() {
        String homeTelNumber = outerUser.getUserHomeInfo().get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

   /*
    *职位信息
    */
    public String getJobPosition() {
        String jobPosition = outerUser.getUserOfficeInfo().get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

   /*
    * 手机号码
    */
    public String getMobileNumber() {
        String mobileNumber = outerUser.getUserBaseInfo().get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

   /*
    * 办公电话
    */
    public String getOfficeTelNumber() {
        String officeTelNumber = outerUser.getUserOfficeInfo().get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

   /*
    * 员工的名称
    */
    public String getUserName() {
        String userName = outerUser.getUserBaseInfo().get("userName");
        System.out.println(userName);
        return userName;
    }
}
package pokupon.autotest.globalTestData;

public class LoginData {
    private String managerUserName = "";
    private String managerUserPassword = "";
    private String simpleUserName = "testpokupon01@gmail.com";
    private String simpleUserPassword = "testpokupon02";

    public LoginData(String managerUserName, String managerUserPassword, String simpleUserName, String simpleUserPassword) {
        this.managerUserName = managerUserName;
        this.managerUserPassword = managerUserPassword;
        this.simpleUserName = simpleUserName;
        this.simpleUserPassword = simpleUserPassword;
    }
    public LoginData(){
        super();
    }

    public String getManagerUserName() {
        return managerUserName;
    }

    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    public String getManagerUserPassword() {
        return managerUserPassword;
    }

    public void setManagerUserPassword(String managerUserPassword) {
        this.managerUserPassword = managerUserPassword;
    }

    public String getSimpleUserName() {
        return simpleUserName;
    }

    public void setSimpleUserName(String simpleUserName) {
        this.simpleUserName = simpleUserName;
    }

    public String getSimpleUserPassword() {
        return simpleUserPassword;
    }

    public void setSimpleUserPassword(String simpleUserPassword) {
        this.simpleUserPassword = simpleUserPassword;
    }
}

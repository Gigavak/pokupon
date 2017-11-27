package pokupon.autotest.globalTestData;

public class LoginData {
    private String managerUserName = "donpokupon@gmail.com";
    private String managerUserPassword = "donpokupon01";
    private String simpleUserName = "testpokupon01@gmail.com";
    private String simpleUserPassword = "testpokupon02";
    private String invalidUserName = "dasdad@gmail.com";
    private String invalidUserPassword = "asd213";

    public LoginData(String managerUserName, String managerUserPassword, String simpleUserName, String simpleUserPassword, String invalidUserName, String invalidUserPassword) {
        this.managerUserName = managerUserName;
        this.managerUserPassword = managerUserPassword;
        this.simpleUserName = simpleUserName;
        this.simpleUserPassword = simpleUserPassword;
        this.invalidUserName = invalidUserName;
        this.invalidUserPassword = invalidUserPassword;
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


    public String getInvalidUserName() {
        return invalidUserName;
    }

    public void setInvalidUserName(String invalidUserName) {
        this.invalidUserName = invalidUserName;
    }

    public String getInvalidUserPassword() {
        return invalidUserPassword;
    }

    public void setInvalidUserPassword(String invalidUserPassword) {
        this.invalidUserPassword = invalidUserPassword;
    }
}

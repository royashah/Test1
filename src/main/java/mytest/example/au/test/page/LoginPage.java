package mytest.example.au.test.page;

import mytest.example.au.test.base.ExtendedPage;

public class LoginPage extends ExtendedPage {
    private String userName;
    private String passWord;
    private String submit = "login";

    public String getSubmit() {
        return this.submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public LoginPage(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void init() {
        this.setTextBoxWithName("userName", this.getUserName());
        this.setTextBoxWithName("password", this.getPassWord());
    }
}


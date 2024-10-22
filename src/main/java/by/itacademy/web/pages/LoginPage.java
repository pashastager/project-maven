package by.itacademy.web.pages;

public class LoginPage extends HomePage {
    protected String LOGIN_PAGE = BASE_URL + "w/index.php?returnto=Main+Page&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in";

    @Override
    public void open() {
        super.HOME_URL = LOGIN_PAGE;
        super.open();
    }

    @Override
    public String getTitel() {
        super.HOME_URL = LOGIN_PAGE;
        return super.getTitel();
    }


}

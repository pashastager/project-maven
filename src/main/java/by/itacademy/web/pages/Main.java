package by.itacademy.web.pages;

public class Main {
    public static void main(String[] args) {
        BasePage basePage = new BasePage();
        basePage.open();
        HomePage homePage = new HomePage();
        System.out.println(homePage.getTitel());
        homePage.clickLogin();
        homePage.open();
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        System.out.println(loginPage.getTitel());


    }
}

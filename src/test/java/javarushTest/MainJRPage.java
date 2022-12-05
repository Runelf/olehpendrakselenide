package javarushTest;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainJRPage extends BaseSeleniumPage {
    public static String URL = "https://javarush.ru/";


    public MainJRPage() {
        driver.get(URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://javarush.ru/users']")
    private WebElement usersPage;

    public UsersJRPage openUsersPage() {
        usersPage.click();
        return new UsersJRPage();
    }
}

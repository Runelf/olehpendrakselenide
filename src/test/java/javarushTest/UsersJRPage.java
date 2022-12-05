package javarushTest;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsersJRPage extends BaseSeleniumPage {

    @FindBy(xpath = "//input[@formcontrolname='query']")
    private WebElement searchByName;


    @FindBy(xpath = "//a[@class='user-card__container']")
    private WebElement userPage;

    @FindBy(xpath = "//button[@class='button button--search button--sm ng-star-inserted']")
    private WebElement pressSearchButtom;

    public UsersJRPage() {
        PageFactory.initElements(driver,this);
    }

    public UsersJRPage setSearchByName(String name){
        searchByName.sendKeys(name, Keys.ENTER);
        return this;
    }

    public UserJRPage getUserPage(){
        userPage.click();
        return new UserJRPage();
    }



}

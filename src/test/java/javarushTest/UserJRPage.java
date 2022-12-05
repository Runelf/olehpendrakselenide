package javarushTest;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class UserJRPage extends BaseSeleniumPage {

    @FindBy(xpath = "//div[@class='achievement-card-title']")
    private WebElement achievement;

    public UserJRPage() {
        PageFactory.initElements(driver,this);
    }

    public List<String> getAchievement(){

        List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='achievement-card-title']"));

        return allElements.stream().map(x -> x.getText()).collect(Collectors.toList());


    }


}

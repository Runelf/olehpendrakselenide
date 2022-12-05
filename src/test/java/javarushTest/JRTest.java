package javarushTest;

import core.BaseSeleniumTest;
import org.junit.jupiter.api.Test;

import java.util.List;


public class JRTest extends BaseSeleniumTest {


    @Test
    public void checkUser() {
        UsersJRPage usersJRPage = new MainJRPage().openUsersPage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List <String> achievements = usersJRPage.setSearchByName("Runelf").getUserPage().getAchievement();

        System.out.println(achievements);

        String x = "123";




    }


}

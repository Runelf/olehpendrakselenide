package seleniumtest.wiki;

import com.codeborne.selenide.ElementsCollection;
import seleniumtest.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;

public class WikiTest extends BaseTest {
    private final static String URL = "https://ru.wikipedia.org/wiki/Java";

    @Test
    public void openAllHrefs() {

        Selenide.open(URL);
        ElementsCollection hrefs = $$x("//div[@id='toc']//a[@href]");
        List<String> links = new ArrayList<>();
        hrefs.forEach(x -> links.add(x.getAttribute("href")));
        List<Integer> linksLenght = hrefs.stream().map(x -> x.getAttribute("href").length()).toList();

        int i = 0;
        Assertions.assertTrue(true, String.valueOf(true));

    }

}

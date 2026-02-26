import com.microsoft.playwright.*;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sorting {
    public static void main(String[] args) {
     Playwright playwright= Playwright.create();
     Browser browser= playwright.chromium().launch(
             new BrowserType.LaunchOptions().setHeadless(false)
     );
     Page page= browser.newPage();
     page.navigate("https://practicesoftwaretesting.com/");
     page.selectOption("select", "name,asc");
     page.waitForSelector("[data-test='product-name']");
     List<String> productNames= page.locator("[data-test='product-name']").allTextContents();
     System.out.println(productNames);
     List<String> sortedNames= new ArrayList<>(productNames);
     Collections.sort(sortedNames);
     System.out.println(sortedNames);
     assertEquals(sortedNames, productNames);
     browser.close();
     playwright.close();
    }
}

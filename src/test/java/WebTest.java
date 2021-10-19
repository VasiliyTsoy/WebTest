import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest {


        @Test
        public void testFirst() throws InterruptedException {
            String chromeDriver = "D:\\Work\\Projects\\chromedriver.exe";
            String driverPath = "webdriver.chrome.driver";
            String url = "http://www.99-bottles-of-beer.net/";
            String expectedResult ="http://www.99-bottles-of-beer.net/";


            System.setProperty(driverPath,chromeDriver);
            WebDriver driver = new ChromeDriver();

            driver.get("http://www.99-bottles-of-beer.net/");

            String 

            driver.close();
            driver.quit();
        }
}

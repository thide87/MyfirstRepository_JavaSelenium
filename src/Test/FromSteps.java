package Test;
import Steps.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
public class FromSteps {

    Public void submitFrom(){
        driver = Selenium::WebDriver.for :firefox
        driver.get('http://stackoverflow.com/')

        body = driver.find_element(:tag_name => 'body')
        body.send_keys(:control, 't')

        driver.quit


    }
}

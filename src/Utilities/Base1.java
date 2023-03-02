package Utilities;

public class Base1 {

    public WebDriver driver;protected WebElement webElement;
    public utils(WebDriver driver){    this.driver = driver;
        PageFactory.initElements(driver, this);}public static class UtilsDriver {
        public static String BASE_URL = "https://formy-project.herokuapp.com/form";
        public static String CHROME_DRIVER_LOCATION = "chromedriver";} 

}

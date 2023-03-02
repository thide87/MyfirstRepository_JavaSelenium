package Page;

public class HomePage {

    protected ChromeDriver driver;public HomePage(ChromeDriver driver) {    this.driver = driver;    PageFactory.initElements(driver, this);}

}

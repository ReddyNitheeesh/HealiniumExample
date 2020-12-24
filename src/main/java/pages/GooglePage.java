package pages;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;

public class GooglePage extends BasePage{

    public GooglePage(SelfHealingDriver driver) {
        super(driver);
    }

    public void searchItem(String text)
    {
        driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(text);
    }
}

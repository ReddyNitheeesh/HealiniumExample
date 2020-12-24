package pages;

import com.epam.healenium.SelfHealingDriver;

public class BasePage {

    protected SelfHealingDriver driver;

    public BasePage(SelfHealingDriver driver) {
        this.driver = driver;
    }

}

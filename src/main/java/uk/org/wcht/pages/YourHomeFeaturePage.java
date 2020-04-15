package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

/**
 * Created by Chaitanya
 */
//your home feature page class extends utility class to use properties
public class YourHomeFeaturePage extends Utility {
    //locators for element
    By getYourHomeFeatureText = By.xpath("//h1[contains(text(),'Your home')]");

    //below methods for elements and doing actions on that each elements
    public String getYourHomeMessage() {
        return getTextFromElement(getYourHomeFeatureText);
    }
}


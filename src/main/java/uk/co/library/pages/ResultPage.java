package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    /**
     * Locators - resultText
     * Method - verifyTheResults(String expected)
     */

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());


    @CacheLookup
    @FindBy(xpath ="//h1[@class='search-header__title']")
    WebElement resultText;

 public String verifyTheResults(String result) {
     return getTextFromElement(resultText);
 }





}

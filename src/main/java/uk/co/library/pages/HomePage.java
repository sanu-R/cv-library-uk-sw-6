package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    /**
     * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown,
     * jobTypeDropDown, findJobsBtn
     * Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance),
     * clickOnMoreSearchOptionLink(),
     * enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType),
     * selectJobType(String jobType),
     * clickOnFindJobsButton().
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    public void enterJobTitle(String job) {

        sendTextToElement(jobTitle, job);
        log.info("Enter the Job title.."+ jobTitle);
    }

    public void enterLocation(String loc) {

        sendTextToElement(location, loc);
        log.info("Enter Location .."+ location);
    }

    public void selectDistance(String dis) {
        selectByValueFromDropDown(distanceDropDown, dis);
        log.info("Select Distance.."+ distanceDropDown);
    }

    public void clickOnMoreSearchOptionLink() {

        clickOnElement(moreSearchOptionsLink);
        log.info("Clicking on more search options link.."+moreSearchOptionsLink.toString());

    }
    public void acceptCookies(){
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookies);
        log.info("Clicking on login link : " + acceptCookies.toString());
    }
    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
        log.info("Enter Min Salary"+salaryMin);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
        log.info("Enter Max Salary"+ salaryMax);
    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        log.info("Select Salary Type"+ salaryTypeDropDown);
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("Select Job Type"+jobTypeDropDown);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
        log.info("click on find Jobs Button" + findJobsBtn.toString());
    }


}

package Pages.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Rolan Abdualiev , Dec 2021
 * @project QA-AutomationDemonstration
 */
public class GrafanaMenuPage {

    @FindBy(xpath = "//*[@class='css-1pe5hie dropdown'][2]")
    private static WebElement plusElement;

    @FindBy(xpath = "//*[@id=\"reactRoot\"]/div/main/div[3]/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div[2]/div[1]/div[1]")
    private static WebElement addDashboardElement;

    @FindBy(css = "a[aria-label='Server Admin']")
    private static WebElement serverAdminElement;

    @FindBy(css = "ul a.css-10jwdjd[href='/admin/users']")
    private static WebElement serverAdminUsersElement;

    @FindBy(css = "h1.css-1aanzv4")
    private static WebElement grafanaHeader;

    @FindBy(css = "nav[aria-label='Search links'] a.css-mgcb1x")
    private static WebElement generalButton;

    @FindBy(css = "button > span > div > svg > path")
    private static WebElement searchDashboards;

    @FindBy(css = "div:nth-child(1) > ul > li > button")
    private static WebElement searchDashboardsLabel;


    // Getters
    public WebElement getPlusElement() {
        return plusElement;
    }

    public WebElement getAddDashboardElement() {
        return addDashboardElement;
    }

    public WebElement getServerAdminElement() {
        return serverAdminElement;
    }

    public WebElement getServerAdminUsers() {
        return serverAdminUsersElement;
    }

    public WebElement getGeneralButton() {
        return generalButton;
    }

    public String getGrafanaHeaderText() {
        return grafanaHeader.getText();
    }

    public WebElement getSearchDashboards() {
        return searchDashboards;
    }

    public WebElement getSearchDashboardsLabel() {
        return searchDashboardsLabel;
    }

}

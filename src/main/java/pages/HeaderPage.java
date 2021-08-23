package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HeaderPage extends BasePage{

    @FindBy(css="#nav li[class*='level0']")
    private List<WebElement> categoryElements;

    @FindBy(css=".account-cart-wrapper a[class*='skip-account']")
    private WebElement account;

    @FindBy(css=".account-cart-wrapper a[class*='skip-cart']")
    private WebElement cart;

    public void clickOnAccount(){
        clickOn(account);
    }

    public void clickOnALinkFromAccount(String title){
        getDriver().findElement(By.cssSelector("#header-account .links ul li a[title='"+title+"']")).click();
    }

    public void clickOnCategory(String categoryName){
        for(WebElement category:categoryElements){
            if(category.getText().equalsIgnoreCase(categoryName)){
                clickOn(category);
                break;
            }
        }
    }
}

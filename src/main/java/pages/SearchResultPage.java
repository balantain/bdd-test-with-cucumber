package pages;

import org.openqa.selenium.By;

public class SearchResultPage extends BasePage{

    public String getTitle(){
        return findElement(By.xpath("//div[@class='td-content']/h1")).getText();
    }
}

package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class SearchResultsPage extends AbstractPage {

    @FindBy(css = ".products-grid li.item")
    private List<WebElementFacade> productsList;

    public boolean checkListForProduct(String productName){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
    public void selectProductFromList(String product){
        for(WebElementFacade element : productsList){
            if(element.findElement(By.cssSelector(".product-name a")).getText().equalsIgnoreCase(product)){
                element.findElement(By.cssSelector("a.product-image")).click();
                break;
            }
        }
    }
}

package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod {
public static void SelectClass(WebElement ele,String option) 

{
Select a=new Select(ele);
a.selectByVisibleText(option);

}
}

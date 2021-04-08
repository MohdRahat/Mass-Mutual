package components;

import io.qameta.allure.Allure;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reusablefunctions.TestUtil;

import java.util.ArrayList;
import java.util.List;

public class ValuesComponent {

    WebDriver driver;

    @FindBy(xpath = "//*[starts-with(@id,'lbl_val_'<arg0>')]")
    private List<WebElement> ValueTxt;

    @FindBy(xpath = "//*[starts-with(@id,'txt_val_'<arg0>')]")
    private List<WebElement> ValueAmount;

    @FindBy(xpath = "//*[@id='lbl_val_1']")
    private WebElement Valuelabel1;

    @FindBy(xpath = "//*[@id='lbl_val_2']")
    private WebElement Valuelabel2;

    @FindBy(xpath = "//*[@id='lbl_val_3']")
    private WebElement Valuelabel3;

    @FindBy(xpath = "//*[@id='lbl_val_4']")
    private WebElement Valuelabel4;

    @FindBy(xpath = "//*[@id='lbl_val_5']")
    private WebElement Valuelabel5;

    @FindBy(xpath = "//*[@id='txt_val_1']")
    private WebElement ValueAmount1;

    @FindBy(xpath = "//*[@id='txt_val_2']")
    private WebElement ValueAmount2;

    @FindBy(xpath = "//*[@id='txt_val_3']")
    private WebElement ValueAmount3;

    @FindBy(xpath = "//*[@id='txt_val_4']")
    private WebElement ValueAmount4;

    @FindBy(xpath = "//*[@id='txt_val_5']")
    private WebElement ValueAmount5;

    @FindBy(xpath = "//*[@id='lbl_ttl_val']")
    private WebElement ValueTotalBalance;

    @FindBy(xpath = "//*[@id='txt_ttl_val']")
    private WebElement ValueTotalAmount;

    WebDriverWait wait = new WebDriverWait(driver, 30);


    public void rightCount() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements());
            List<WebElement> ValueTxt = new ArrayList<>();
            if (ValueTxt.size() == 5) {
                Allure.addDescription("Values Appeared on the Screen are right in Count");
                Allure.addAttachment("Values Appeared on the Screen are right in Count", TestUtil.takeScreenshot());
            } else {
                Assert.fail();
                Allure.addAttachment("Values Appeared on the Screen are Not right in Count", TestUtil.takeScreenshot());
            }
        } catch (Exception e) {
            Allure.addAttachment("Values Appeared on the Screen are Not right in Count", TestUtil.takeScreenshot());
        }
    }

    public void countGreaterThanZero() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements());
            List<WebElement> ValueTxt = new ArrayList<>();
            if (ValueTxt.size() > 0) {
                Allure.addDescription("Values Appeared on the Screen are Greater than zero in Count");
                Allure.addAttachment("Values Appeared on the Screen are Greater than zero in Count", TestUtil.takeScreenshot());
            } else {
                Assert.fail();
                Allure.addAttachment("Values Appeared on the Screen are Not Greater than zero in Count", TestUtil.takeScreenshot());
            }
        } catch (Exception e) {
            Allure.addAttachment("Values Appeared on the Screen are Not Greater than zero in Count", TestUtil.takeScreenshot());
        }
    }

    public void totalBalanceIsCorrect() {
        try {
//            String ValueAmount1, String ValueAmount2, String ValueAmount3, String ValueAmount4, String ValueAmount5
            wait.until(ExpectedConditions.visibilityOfAllElements());
            List<WebElement> ValueAmount = new ArrayList<>();
            if (Valuelabel1.isDisplayed()) {
//                String[] total = {ValueAmount1, ValueAmount2, ValueAmount3, ValueAmount4, ValueAmount5};
                List<Float> AmountValues = new ArrayList<>();
                float sum = 0;
            }
            if (ValueAmount.size() != 5) {
                Assert.fail();
            } else {
//                for (String TotalAmount : ValueAmount) {
//                    int index = TotalAmount.indexOf('$');
//                    index++;
//                    TotalAmount = TotalAmount.substring(index);
//                    float f = Float.parseFloat(TotalAmount);
//                    TotalAmount.add(f);
//                }
//                for (int i = 0; i <= 4; i++) {
//                    sum = sum + AmountValues.get(i);
//                }
//                float totalValue = ValueAmount.get(5);
//                double roundedSum = Math.round(sum * 20.0) / 20.0;
//                double roundedOrderTotal = Math.round(totalValue * 20.0) / 20.0;
//                Assert.assertEquals(roundedSum, roundedOrderTotal);
//                Allure.addAttachment("", TestUtil.takeScreenshot());
            }

        } catch (Exception e) {
            Allure.addAttachment("Values Appeared on the Screen are Not Greater than zero in Count", TestUtil.takeScreenshot());
        }
    }
}

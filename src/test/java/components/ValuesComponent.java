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

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

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
    private float ValueTotalAmount;

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
            wait.until(ExpectedConditions.visibilityOfAllElements());
            List<String> ValueAmount = new ArrayList<>();
            if (Valuelabel1.isDisplayed()) {
                List<Float> AmountValues = new ArrayList<>();
            }
            float sum = 0;
            if (ValueAmount.size() != 5) {
                Assert.fail();
            } else {
                for (String TotalAmount : ValueAmount) {
                    int index = TotalAmount.indexOf('$');
                    index++;
                    TotalAmount = TotalAmount.substring(index);
                    float f = Float.parseFloat(TotalAmount);
//                    ValueAmount.add(f);
                }
                for (int i = 0; i <= 4; i++) {
//                    sum = sum + AmountValues.get(i);
                }
                float totalValue = ValueTotalAmount;
                double roundedSum = Math.round(sum * 20.0) / 20.0;
                double roundedOrderTotal = Math.round(totalValue * 20.0) / 20.0;
                Assert.assertEquals(roundedSum, roundedOrderTotal);
                Allure.addAttachment("", TestUtil.takeScreenshot());
            }

        } catch (Exception e) {
            Allure.addAttachment("Total Balance is Not Correct", TestUtil.takeScreenshot());
        }
    }

    public void valuesFormattedAsCurrencies() {
        try {
            List<String> ValueAmountTotal = new ArrayList<>();
            Locale currentLocale = Locale.getDefault();
            Currency currency = Currency.getInstance(currentLocale);
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
            String symbol = currency.getSymbol();
            for (String ValueAmount : ValueAmountTotal) ;
            int index = ValueAmount.indexOf('$');
            index++;
            if (ValueAmount.subList(0, 4).contains('$')) {
                for (int i = 0; i <= 4; i++) {
                    Allure.addDescription("Values has Currency Symbol $");
                }
            }
        } catch (Exception e) {
            Allure.addAttachment("Values Does not has Currency Symbol $", TestUtil.takeScreenshot());
        }
    }

    public void totalMatchesTheSumAmount() {
        try {
            wait.until(ExpectedConditions.visibilityOfAllElements());
            List<String> ValueAmount = new ArrayList<>();
            if (Valuelabel1.isDisplayed()) {
                List<Float> AmountValues = new ArrayList<>();
            }
            float sum = 0;
            if (ValueAmount.size() != 5) {
                Assert.fail();
            } else {
                for (String TotalAmount : ValueAmount) {
                    int index = TotalAmount.indexOf('$');
                    index++;
                    TotalAmount = TotalAmount.substring(index);
                    float f = Float.parseFloat(TotalAmount);
//                    ValueAmount.add(f);
                }
                for (int i = 0; i <= 4; i++) {
//                    sum = sum + AmountValues.get(i);
                }
                float totalValue = ValueTotalAmount;
                double roundedSum = Math.round(sum * 20.0) / 20.0;
                double roundedOrderTotal = Math.round(totalValue * 20.0) / 20.0;
                Assert.assertEquals(roundedSum, roundedOrderTotal);
                Allure.addAttachment("", TestUtil.takeScreenshot());
            }

        } catch (Exception e) {
            Allure.addAttachment("Total Does not Matches the Sum AMount", TestUtil.takeScreenshot());
        }
    }
}

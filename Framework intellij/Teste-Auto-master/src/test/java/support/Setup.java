package support;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;




public class Setup {
    public static WebDriver driver;
    private static final long DEFAULT_WAIT_TIMEOUT = 40;
    public static WebDriverWait wait;
    private String parType;


    public void start(String parBrowser) {
        String title;
        try {
            title = driver.getTitle();
        } catch (Exception e) {
            title = "ERROR";
        }
        if (title.equals("ERROR")) {
            switch (parBrowser) {
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions options;
                    options = new FirefoxOptions();
                    options.addPreference(FirefoxDriver.MARIONETTE, true);
                    driver = new FirefoxDriver(options);
                    driver.manage().window().maximize();
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    driver.manage().window().maximize();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    driver = new EdgeDriver(edgeOptions);
                    driver.manage().window().maximize();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    OperaOptions operaOptions = new OperaOptions();
                    driver = new OperaDriver(operaOptions);
                    driver.manage().window().maximize();
                default:

            }
        }
        driver.manage().timeouts().implicitlyWait(DEFAULT_WAIT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        int size = driver.manage().window().getSize().getWidth();

        if (size < 1400) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        }

        wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);

    }

    private String getAttributeType(String... parType) {
        String type;
        if (parType.length == 0) {
            type = "id";
        } else {
            type = parType[0];
        }
        return type;
    }

    private By getLocatorBy(String parValue, String... parType) {
        final String selector = getAttributeType(parType);
        switch (selector) {
            case "id":
                return By.id(parValue);
            case "name":
                return By.name(parValue);
            case "css":
                return By.cssSelector(parValue);
            case "xpath":
                return By.xpath(parValue);
            case "link":
                return By.linkText(parValue);
            case "class":
                return By.className(parValue);
            case "tag":
                return By.tagName(parValue);
            default:
                return By.id(parValue);
        }
    }

    public WebElement findElem(String parValue, String... parType) {
        final By locator = getLocatorBy(parValue, parType);
        WebElement element;
        try {
            element = driver.findElement(locator);
        } catch (NoSuchElementException e) {
            element = null;
        }
        return element;
    }

    public void click(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        element.click();
    }

    public void openURL(String parURL) {
        driver.get(parURL);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void quit() {
        driver.quit();
    }

    public void sendKeys(String parText, String parValue, String parType) {
        final WebElement element = findElem(parValue, parType);

        element.clear();
        element.sendKeys(parText);
    }

    public void scrollTo(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("const obstramitacao = document.querySelector('#obs-tramitacao');obstramitacao.scrollIntoView()");

    }

    public void doubleclick(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        Actions act = new Actions(driver);
        act.doubleClick(element);
    }

    public void forceClick(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    public void sendKeysNoClear(String parText, String parName, String[] parType) {
        final WebElement element = findElem(parName, parType);
        element.sendKeys(parText);
    }

    public String getText(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getText();
    }

    public String getValue(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("value");
    }

    public String getPlaceholder(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("placeholder");
    }

    public String getHref(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("href");
    }

    public String getAlt(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("alt");
    }

    public String getSrc(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("src");
    }

    public String getSize(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);

        return element.getAttribute("size");
    }


    public TakesScreenshot getCamera() {
        return (TakesScreenshot) driver;
    }

    public void waitElementToBeClickable(String parName, String... parType) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        final By locator = getLocatorBy(parName, parType);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (NoSuchElementException e) {
            System.err.println("ERROR WAIT => " + e.toString());
        } catch (TimeoutException e) {
            System.err.println("Element is not clickable => " + e.toString());
        }
    }

    public void waitElement(String parName, String... parType) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        final By locator = getLocatorBy(parName, parType);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (NoSuchElementException e) {
            System.out.println("ERROR WAIT => " + e.toString());
        } catch (TimeoutException e) {
            System.err.println("Timeout reached while waiting for element =>" + e.toString());
        }
    }

    public void waitURL(String parValue) {
        final WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT_TIMEOUT);
        wait.until(ExpectedConditions.urlContains(String.valueOf(parValue)));
    }

    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    public void switchTo(String... parValue) {
        if (parValue.length == 0) {
            driver.switchTo().defaultContent();
        } else {
            driver.switchTo().window(String.valueOf(parValue));
        }
    }

    public void switchWin(String... parValue) {
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println(tabs.size());
        driver.switchTo().window((String) tabs.get(parValue.length));
    }

    public void ScrollTo(WebElement parValue) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", parValue);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void getClass(String parValue, String... parType) {
        final WebElement element = findElem(parValue, parType);
        element.click();
    }

}
# <img src="resources/maqslogo.ico" height="32" width="32"> EventHandler
Implements the WebDriverEventListener

## Inheritance Hierarchy
```java
WebDriverEventListener
    com.magenic.jmaqs.selenium.EventHandler
```
Package: com.magenic.jmaqs.selenium;
<br> Assembly: import com.magenic.jmaqs.selenium.EventHandler;

## Syntax
Java

```java
public class EventHandler implements WebDriverEventListener
```

The EventHandler type exposes the following members.

## Constructors
Instantiates a new EventHandler object.
#### Written as
```java
public EventHandler(Logger logger)
```
#### Example
```java
this.eventHandler = new EventHandler(this.getLogger());
```

# Methods

## BeforeClickOn
Log message before clicking element.
#### Written as
```java
void beforeClickOn(WebElement element, WebDriver driver)
```

## AfterClickOn
Log message after clicking element.
#### Written as
```java
void afterClickOn(WebElement element, WebDriver driver)
```

## BeforeChangeValueOf
Log message before changing an element's value.
#### Written as
```java
void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) 
```

## AfterChangeValueOf
Log message after changing an element's value.
#### Written as
```java
void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
```

## BeforeFindBy
Log message before finding an element.
#### Written as
```java
void beforeFindBy(By by, WebElement element, WebDriver driver)
```

## AfterFindBy
Log message after finding an element.
#### Written as
```java
void afterFindBy(By by, WebElement element, WebDriver driver)
```

## BeforeNavigateBack
Log message before navigating back to a page.
#### Written as
```java
void beforeNavigateBack(WebDriver driver)
```

## AfterNavigateBack
Log message after navigating back to a page.
#### Written as
```java
void afterNavigateBack(WebDriver driver)
```

## BeforeNavigateForward
Log message before navigating forward to a page.
#### Written as
```java
void beforeNavigateForward(WebDriver driver)
```

## AfterNavigateForward
Log message after navigating forward to a page.
#### Written as
```java
void afterNavigateForward(WebDriver driver)
```

## BeforeNavigateRefresh
Log message before refreshing the page.
#### Written as
```java
void beforeNavigateRefresh(WebDriver driver)
```

## AfterNavigateRefresh
Log message after refreshing the page.
#### Written as
```java
void afterNavigateRefresh(WebDriver driver)
```

## BeforeNavigateTo
Log message before navigating to a page.
#### Written as
```java
void beforeNavigateTo(String url, WebDriver driver)
```

## AfterNavigateTo
Log message after navigating to a page.
#### Written as
```java
void afterNavigateTo(String url, WebDriver driver) 
```

## BeforeScript
Log message before executing a script.
#### Written as
```java
void beforeScript(String script, WebDriver driver)
```

## AfterScript
Log message after executing a script.
#### Written as
```java
void afterScript(String script, WebDriver driver)
```

## BeforeSwitchToWindow
Log message before switching to a window.
#### Written as
```java
void beforeSwitchToWindow(String windowName, WebDriver driver)
```

## AfterSwitchToWindow
Log message after switching to a window.
#### Written as
```java
void afterSwitchToWindow(String windowName, WebDriver driver)
```

## BeforeAlertAccept
Log message before accepting an alert.
#### Written as
```java
void beforeAlertAccept(WebDriver driver)
```

## AfterAlertAccept
Log message after accepting an alert.
#### Written as
```java
void afterAlertAccept(WebDriver driver)
```

## BeforeAlertDismiss
Log Message before dismissing an alert.
#### Written as
```java
void beforeAlertDismiss(WebDriver driver)
```

## AfterAlertDismiss
Log message after accepting an alert.
#### Written as
```java
void afterAlertDismiss(WebDriver driver)
```

## OnException
Log Message when there is an exception.
#### Written as
```java
void onException(Throwable e, WebDriver driver)
```

## BeforeGetScreenshotAs
Log message before getting a screenshot.
#### Written as
```java
void beforeGetScreenshotAs(OutputType<X> target)
```

## AfterGetScreenshotAs
Log message after getting a screenshot.
#### Written as
```java
void afterGetScreenshotAs(OutputType<X> target, X screenshot)
```

## BeforeGetText
Log message before getting text from an element.
#### Written as
```java
void beforeGetText(WebElement element, WebDriver driver)
```

## AfterGetText
Log message after getting text from an element.
#### Written as
```java
void afterGetText(WebElement element, WebDriver driver, String text)
```

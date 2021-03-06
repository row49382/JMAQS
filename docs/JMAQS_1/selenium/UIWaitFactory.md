# <img src="resources/maqslogo.ico" height="32" width="32"> UIWaitFactory
Factory class that is used for creating and maintaining a thread-safe collection of wait drivers.

## Inheritance Hierarchy
```java
com.magenic.jmaqs.selenium.UIWaitFactory
```
Package: com.magenic.jmaqs.selenium;
<br> Assembly: import com.magenic.jmaqs.selenium.UIWaitFactory;

## Syntax
Java
```java
public class UIWaitFactory
```
The UIWait type exposes the following members.

## Constructors
Instantiates a new UIWait object.
#### Written as
```java
private UIWaitFactory() 
```

# Methods

## GetWaitDriver
Gets the UIWait object from the wait collection.
<br> If none exists, one is created and cached using the driver provided.
#### Written as
```java
UIWait getWaitDriver(SearchContext searchContext)
```
#### Example
```java
WebElement element = UIWaitFactory.getWaitDriver(webDriver).waitForClickableElement(by);
```

## SetWaitDriver
Adds the waitDriver to the wait collection.
#### Written as
```java
void setWaitDriver(SearchContext driver, UIWait waitDriver)
```
#### Example
```java
UIWait waitDriver = new UIWait(this.getWebDriver());
UIWaitFactory.setWaitDriver(this.getWebDriver(), waitDriver);
```

## RemoveWaitDriver
Removes the waitDriver from the collection.
#### Written as
```java
void removeWaitDriver(SearchContext driver)
```
#### Example
```java
UIWaitFactory.removeWaitDriver(this.getWebDriver());
```

## GetLowLevelDriver
Gets the low level driver.
#### Written as
```java
WebDriver getLowLevelDriver(SearchContext searchContext)
```
Example
```java
 WebDriver baseDriver = getLowLevelDriver(searchContext);
```
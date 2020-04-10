package com.magenic.jmaqs.webservices.jdk11;

import com.magenic.jmaqs.utilities.helper.TestCategories;
import com.magenic.jmaqs.webservices.jdk8.MediaType;
import java.io.IOException;
import java.net.URISyntaxException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebServiceDriverUnitTest {

  /**
   * Verifies that basic GET features work with the WebServiceDriver.
   */
  @Test(groups = TestCategories.WEB_SERVICE)
  public void setHttpClient() throws URISyntaxException, IOException {
    WebServiceDriver webServiceDriver1 = new WebServiceDriver(
        "http://magenicautomation.azurewebsites.net");
    webServiceDriver1.setHttpClient(webServiceDriver1.getHttpClient(MediaType.APP_JSON.toString()));
    WebServiceDriver webServiceDriver2 = new WebServiceDriver(
        webServiceDriver1.getHttpClient(MediaType.APP_XML.toString()));
    Assert.assertNotNull(webServiceDriver1.getHttpClient(MediaType.APP_JSON.toString()),
        "Driver 1 is null");
    Assert.assertNotNull(webServiceDriver2, "Driver 2 is null");
  }

  public void setHttpRequest() throws IOException, URISyntaxException {
    WebServiceDriver webServiceDriver = new WebServiceDriver(
        "http://magenicautomation.azurewebsites.net");
    webServiceDriver.setHttpRequest(webServiceDriver.getHttpRequest());
  }
}
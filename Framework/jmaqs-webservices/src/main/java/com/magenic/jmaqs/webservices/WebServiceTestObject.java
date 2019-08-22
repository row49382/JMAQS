/*
 * Copyright 2019 (C) Magenic, All rights Reserved
 */

package com.magenic.jmaqs.webservices;

import com.magenic.jmaqs.base.BaseTestObject;
import com.magenic.jmaqs.utilities.logging.Logger;

/**
 * Web service test object class.
 */
public class WebServiceTestObject extends BaseTestObject {

  /**
   * The HTTP client wrapper.
   */
  protected HttpClientWrapper webServiceWrapper;
  
  /**
   * Initializes a new instance of the WebServiceTestObject.
   * 
   * @param webServiceWrapper
   *          The web service wrapper
   * @param logger
   *          The Logger Object
   * @param fullyQualifiedTestName
   *          The fully qualified test name
   */
  public WebServiceTestObject(HttpClientWrapper webServiceWrapper, Logger logger, String fullyQualifiedTestName) {
    super(logger, fullyQualifiedTestName);
    this.webServiceWrapper = webServiceWrapper;
  }
  
  /**
   * Get the web service wrapper for the WebServiceTestObject.
   * 
   * @return A web service wrapper object
   */
  public HttpClientWrapper getWebServiceWrapper() {
    return this.webServiceWrapper;
  }

  /**
   * Set the web service wrapper for the WebServiceTestObject.
   * 
   * @param webServiceWrapper
   *          The web service wrapper object
   */
  public void setWebServiceWrapper(HttpClientWrapper webServiceWrapper) {
    this.webServiceWrapper = webServiceWrapper;
  }

}
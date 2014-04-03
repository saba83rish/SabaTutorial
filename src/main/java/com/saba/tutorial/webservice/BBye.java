package com.saba.tutorial.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author chands
 */
@WebService
public class BBye {

   @WebMethod
   public String tata(String text) {
      return "Tata " + text;
   }
}

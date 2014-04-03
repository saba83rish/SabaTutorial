package com.saba.tutorial.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author chands
 */
@WebService(targetNamespace = "http://webservice.tutorial.saba.com/", portName = "Hello", wsdlLocation = "http://localhost:8080/SabaTutorial/Hello?wsdl")
public class Hello implements HelloInterface {

   private final String message = new String("Hello, ");

   @WebMethod(operationName = "sayHello")
   public String sayHello(String name) {
      return message + name + ".";
   }

   @WebMethod(operationName = "sayBye")
   public String sayBye(String name, Date time) {
      return "BBye " + name + " at " + time;
   }

}

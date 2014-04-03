package com.saba.tutorial.webservice;

import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author chands
 */
@WebService
public interface HelloInterface {

   @WebMethod
   public String sayHello(String name);

   @WebMethod
   public String sayBye(String name, Date time);

}

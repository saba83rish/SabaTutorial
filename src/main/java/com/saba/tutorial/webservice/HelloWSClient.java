/**
 * 
 */
package com.saba.tutorial.webservice;

import java.net.URL;
import java.util.Date;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author chands
 */
public class HelloWSClient {

   public static void main(String[] args) throws Exception {

      
       URL url = new URL("http://localhost:8080/SabaTutorial/Hello?wsdl"); 
       // 1st argument service URI, refer to wsdl document above 
      // 2nd argument
     // is service name, refer to wsdl document above 
      QName qname = new
       QName("http://webservice.tutorial.saba.com/", "HelloService"); 
      Service
       service = Service.create(url, qname); HelloInterface helloObj =
       service.getPort(HelloInterface.class);
       System.out.println(helloObj.sayHello("Saba"));
       System.out.println(helloObj.sayBye("Aarush", new Date()));
     

   }

}

/**
 * 
 */
package com.saba.tutorial.webservice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author chands
 */
@ApplicationPath("/")
public class ApplicationHelloResource extends Application {

   @Override
   @SuppressWarnings("unchecked")
   public Set<Class<?>> getClasses() {
      return new HashSet<Class<?>>(Arrays.asList(HelloWorldResource.class));
   }

}

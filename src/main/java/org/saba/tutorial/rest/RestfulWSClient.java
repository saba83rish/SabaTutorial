package org.saba.tutorial.rest;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.client.ClientProtocolException;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

/**
 * @author ShabbuDhee
 *
 */
public class RestfulWSClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			System.out.println("Starting Client");
			 
			ClientRequest request = new ClientRequest(
					"http://localhost:8080/SabaTutorial/helloworld/json");
			request.accept("application/json");
			System.out.println("After creating clinet request");
			ClientResponse<String> response = request.get(String.class);
			System.out.println("STATUS ::"+response.getStatus());
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
					+ response.getStatus());
			}
	 
			BufferedReader br = new BufferedReader(new InputStreamReader(
				new ByteArrayInputStream(response.getEntity().getBytes())));
	 
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
	 
		  } catch (ClientProtocolException e) {
	 
			e.printStackTrace();
	 
		  } catch (IOException e) {
	 
			e.printStackTrace();
	 
		  } catch (Exception e) {
	 
			e.printStackTrace();
	 
		  }

	}

}

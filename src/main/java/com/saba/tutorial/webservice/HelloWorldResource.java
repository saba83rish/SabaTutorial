package com.saba.tutorial.webservice;

/**
 * A sample class to demo all the different methods used in a restful webservice with seperate url paths.
 * @author chands
 *
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class HelloWorldResource {

   private static List<Track> trackList = new ArrayList<Track>();

   // The Java method will process HTTP GET requests
   @GET
   @Path("/text")
   // The Java method will produce content identified by the MIME Media
   // type "text/plain"
   @Produces("text/plain")
   public String getClichedMessage() {
      // Return some cliched textual content
      return "Hello World";
   }

   @GET
   @Path("/json")
   @Produces("application/json")
   public Track getJson() {
      // Return some cliched textual content

      return createTrackObject();
   }

   @GET
   @Path("/xml")
   @Produces("application/xml")
   public Track getXml() {
      // Return some cliched textual content

      return createTrackObject();
   }

   @POST
   @Path("/post/text")
   @Consumes("text/plain")
   @Produces("text/plain")
   public String postInputText(String input) {

      String postResponseString = "Consumes the input text sent : " + input;
      System.out.println(postResponseString);
      return postResponseString;
   }

   @POST
   @Path("/post/form")
   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
   @Produces("application/xml")
   public Track postInputXml(@FormParam("id") String id, @FormParam("title") String title,
            @FormParam("singer") String singer) {

      System.out.println("Incoming Form values for singer " + singer + " and title " + title);
      Track trackObj = createTrackObject();
      trackObj.setId(id);
      trackObj.setSinger(singer);
      trackObj.setTitle(title);
      return trackObj;
   }

   @GET
   @Path("/pathparam/{param}")
   public Response getMsg(@PathParam("param") String msg) {

      String output = "Path Param Test value is  : " + msg;
      System.out.println(output);

      return Response.status(200).entity(output).build();

   }

   @PUT
   @Path("/put")
   @Consumes(MediaType.APPLICATION_XML)
   @Produces("application/json")
   public Response putTrack(String body) throws JAXBException {

      System.out.println("Initial size of Track List" + trackList.size());
      InputStream is = new ByteArrayInputStream(body.getBytes());
      System.out.println("To String for PUT " + body);
      JAXBContext jaxbContext = JAXBContext.newInstance(Track.class);
      Unmarshaller um = jaxbContext.createUnmarshaller();
      Track trackJaxbObject = (Track) um.unmarshal(is);

      if (trackJaxbObject instanceof Track) {
         trackList.add(trackJaxbObject);
      }
      System.out.println("Final size of Track List" + trackList.size());
      return Response.status(200).entity(trackList).build();
   }

   /**
    * Util method Creates a Track Object
    * @return
    */
   public Track createTrackObject() {
      Track track = new Track();
      track.setId("101");
      track.setTitle("Enter Sandman");
      track.setSinger("Metallica");
      return track;
   }
}

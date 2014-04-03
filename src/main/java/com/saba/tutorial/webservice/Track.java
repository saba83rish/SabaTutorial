/**
 * 
 */
package com.saba.tutorial.webservice;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author chands
 */
@XmlRootElement(name = "track")
public class Track {

   private String title;
   private String singer;
   private String id;

   /**
    * @return the title
    */
   @XmlElement
   public String getTitle() {
      return title;
   }

   /**
    * @param title the title to set
    */
   public void setTitle(String title) {
      this.title = title;
   }

   /**
    * @return the singer
    */
   @XmlElement
   public String getSinger() {
      return singer;
   }

   /**
    * @param singer the singer to set
    */
   public void setSinger(String singer) {
      this.singer = singer;
   }

   /**
    * @return the id
    */
   @XmlAttribute
   public String getId() {
      return id;
   }

   /**
    * @param id the id to set
    */
   public void setId(String id) {
      this.id = id;
   }

}

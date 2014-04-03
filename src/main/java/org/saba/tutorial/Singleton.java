package org.saba.tutorial;

import java.io.Serializable;

/**
 * @author ShabbuDhee
 *
 */
public class Singleton implements Serializable,Cloneable{


	private static final long serialVersionUID = 1L;

	private Singleton() {
		
	}
	
	private static volatile Singleton ref;
	
	public static Singleton getSingleton() {
		if(ref==null) {
			synchronized (Singleton.class) {
				if(ref==null){
					
					ref = new Singleton();
				}
			}
		}
		return ref;
	}
	
	public Object readResolve() {
		return getSingleton();
	}
	
	public Object clone() throws CloneNotSupportedException {
		 
	      throw new CloneNotSupportedException();
	 
	}

}

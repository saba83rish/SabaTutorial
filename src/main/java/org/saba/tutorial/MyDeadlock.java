package org.saba.tutorial;

/**
 * @author ShabbuDhee
 *
 */
public class MyDeadlock {

		String s1="UNO";
		String s2 = "DOS";
		
		Thread t1 = new Thread("First Thread"){
		public void run() {
			System.out.println("First Thread executed");
			while(true){
				synchronized(s1){
					System.out.println("First Thread::Got s1 waiting for s2");
					synchronized(s2){
						System.out.println("First Thread::Got s2");
					}
				}
			}
		}
		};
		
		Thread t2 = new Thread("Second Thread"){
		public void run() {
			System.out.println("Second Thread executed");
			while(true){
				synchronized(s2){
					System.out.println("Second Thread::Got s2 waiting for s1");
					synchronized(s1){
						System.out.println("Second Thread::Got s1");
					}
				}
			}
		}
		};

		public static void main(String args[]){
		    MyDeadlock mdl = new MyDeadlock();
		    mdl.t1.start();
		    mdl.t2.start();
		}

}


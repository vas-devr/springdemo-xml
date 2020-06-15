/**
 * 
 * 
 * @createdOn Jun 13, 2020
 * 
 * @author vasudev
 */
package dev.tutorial.springdemo;

/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 13, 2020
 * @since v1.0.0-00
 * 
 */
public class MyApp {

	/**
	 * Constructor
	 * 
	 */
	public MyApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String... args) {
		
		
		//create new Object
		Coach theCoach = new TrackCoach();
		
		//use the object 
		System.out.println(theCoach.getDailyWorkout());
		
		//use fortune service
		System.out.println ( theCoach.getDailyFortune () );
	}

}

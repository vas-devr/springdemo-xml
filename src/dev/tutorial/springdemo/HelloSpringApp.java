/**
 * 
 * 
 * @createdOn Jun 13, 2020
 * 
 * @author vasudev
 */
package dev.tutorial.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 13, 2020
 * @since v1.0.0-00
 * 
 */
public class HelloSpringApp {
	
	/**
	 * Method Description 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");
		
		//retrieve bean from spring container
		Coach myCoach = context.getBean ( "myCoach", Coach.class );
		//call method on bean
		System.out.println ( myCoach.getDailyWorkout () );
		
		//close context
		context.close ();
	}
	
}

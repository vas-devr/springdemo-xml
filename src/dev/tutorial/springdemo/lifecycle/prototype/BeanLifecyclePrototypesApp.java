/**
 * 
 * 
 * @createdOn Jun 14, 2020
 * 
 * @author vasudev
 */


package dev.tutorial.springdemo.lifecycle.prototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.tutorial.springdemo.Coach;

/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 * 
 */
public class BeanLifecyclePrototypesApp {
	
	public static void main(String... ht) {
		
		
		// fetch application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifecycle-ApplicationContextPrototype.xml"
		);
		
		// create new coach instace
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		// create another coach instance
		Coach myAlphaCoach = context.getBean("myCoach", Coach.class);
		
		//
		Coach MyAlphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if both coach instances are the same
		boolean isSame = (myCoach == myAlphaCoach);
		
		// check outputs
		System.out.println("Are instances same: " + isSame);
		
		System.out.println("Instance of coach: " + myCoach);
		System.out.println("Instance of myAlphaCoach" + myAlphaCoach);
		System.out.println("Instance of myAlphaCoach" + MyAlphaCoach);
		
		// close the context
		context.close();
		
	}
	
}

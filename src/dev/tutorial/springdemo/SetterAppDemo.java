/**
 * 
 * 
 * @createdOn Jun 14, 2020
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
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 * 
 */
public class SetterAppDemo {
	
	public static void main(String... var) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
		System.out.println();
		
		context.close();
	}
	
	
}

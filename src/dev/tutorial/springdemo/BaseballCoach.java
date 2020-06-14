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
public class BaseballCoach implements Coach{

	/**
	 * Constructor
	 * 
	 */
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}
	
			@Override
	public String getDailyWorkout() {
		return " Spend 30 minutes ";
	}

}

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
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 45 mins on track for 5k";
	}

}

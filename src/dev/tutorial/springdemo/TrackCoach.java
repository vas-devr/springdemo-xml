/**
 * 
 * 
 * @createdOn Jun 13, 2020
 * 
 * 
 * @author vasudev
 */


package dev.tutorial.springdemo;

import org.springframework.beans.factory.DisposableBean;

/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 13, 2020
 * @since v1.0.0-00
 * 
 */
public class TrackCoach implements Coach, DisposableBean {
	
	private FortuneService fortuneService;
	
	/**
	 * Constructor
	 * 
	 */
	public TrackCoach() {
		
		super();
	}
	
	/**
	 * Constructor
	 * 
	 * @param fortuneService
	 */
	public TrackCoach( FortuneService fortuneService ) {
		
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Spend 45 mins on track for 5k";
	}
	
	@Override
	public String getDailyFortune() {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	// bean startup method
	public void myStartup() {
		
		System.out.println("TrackCoah: mystartup");
	}
	
	// bean destroy method
	public void myDestroy() {
		
		System.out.println("TrackCoach: mydestroy");
	}
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("TrackCoach: mydestroy " + this.getClass().hashCode());
		
	}
	
}

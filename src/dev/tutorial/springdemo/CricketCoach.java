/**
 * 
 * 
 * @createdOn Jun 14, 2020
 * 
 * @author vasudev
 */


package dev.tutorial.springdemo;


/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 * 
 */
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String         team;
	private String         emailAddress;
	
	@Override
	public String getDailyWorkout() {
		
		return "Play cricket";
	}
	
	
	/**
	 * Constructor
	 * 
	 */
	public CricketCoach() {
		
		System.out.println(" Cricket coach no arg constructor ");
	}
	
	@Override
	public String getDailyFortune() {
		
		return "Cricket " + fortuneService.getFortune();
	}
	
	
	/**
	 * @return the fortuneService
	 */
	public FortuneService getFortuneService() {
		
		return fortuneService;
	}
	
	
	/**
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}
	
	
	/**
	 * @return the team
	 */
	public String getTeam() {
		
		return team;
	}
	
	
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		
		System.out.println("team name " + team);
		this.team = team;
	}
	
	
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		
		return emailAddress;
	}
	
	
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		
		System.out.println("email " + emailAddress);
		this.emailAddress = emailAddress;
	}
	
}

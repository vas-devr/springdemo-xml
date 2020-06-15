/**
 * 
 * 
 * @createdOn Jun 14, 2020
 * 
 * @author vasudev
 */


package dev.tutorial.springdemo;

import java.util.Random;

/**
 * 
 * Description about this class ....
 * 
 * @author vasudev
 * @createdOn Jun 14, 2020
 * @since v1.0.0-00
 * 
 */
public class RandomFortuneService implements FortuneService {
	
	private final String[] fortunes = { "Fortune number 1", "Fortune number 2", "Fortune number 3" };
	
	@Override
	public String getFortune() {
		
		return fortunes[new Random().nextInt(3)];
		
	}
	
}

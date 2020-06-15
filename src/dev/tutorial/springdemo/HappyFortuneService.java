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
public class HappyFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		
		return " Today is your lucky day ";
	}
	
}

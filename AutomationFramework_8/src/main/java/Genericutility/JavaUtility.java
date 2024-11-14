package Genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
/**
 * this method generate system date and time 
 * @return
 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * this method returns random number within 1000
	 * @return
	 */
	public int getRandomNumber() {
		Random ram=new Random();
		return ram.nextInt(1000);
	}
}

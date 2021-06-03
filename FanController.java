import java.util.Random;

public class FanController {

	public static float getCurrentTemperature(){
		
		float randomTemp= (float)(Math.random()*100);
		return randomTemp;
	}
	
	public static void setDutyCycle(int dutyCycle){
		System.out.println(" dutyCycle:   " + dutyCycle);
	}
	
	public static void fanController() {
		int dutyCycle = 0;
		float currentTemp = getCurrentTemperature();
		
		if (currentTemp <= 25.0) {
			dutyCycle = 20;
		} else if (currentTemp >= 75.0){
			dutyCycle= 100;
			
		} else {  float ratioCycle = (float)((currentTemp - 25)* (1.60));
				dutyCycle = (int)ratioCycle + 20;
			 };
			 
	    System.out.println("CurrentTemp:  " + currentTemp);
	    setDutyCycle(dutyCycle);

	}
	
	public static void main(String[] args) {
	
		// running for 100 calls with if loop
		for (int i=0; i<100; i++)	{
			fanController();
		}
		
	}
}

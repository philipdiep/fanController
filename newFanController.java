
public class newFanController {
	
	public static void newFanController() {
		int dutyCycle = 0;

		float currentTemp = CurrentTemperature.getCurrentTemperature();
//		float currentTemp = 75;
		
		if (currentTemp <= 25.0) {
			dutyCycle = 20;
		} else if (currentTemp >= 75.0){
			dutyCycle= 100;
			
		} else {  float ratioCycle = (float)((currentTemp - 25)* (1.60));
				dutyCycle = (int)ratioCycle + 20;
			 };
			 
	    System.out.println("CurrentTemp:  " + currentTemp);
//	    setDutyCycle setdutyCycle = new setDutyCycle();
	    DutyCycle.setDutyCycle(dutyCycle);

	}

}

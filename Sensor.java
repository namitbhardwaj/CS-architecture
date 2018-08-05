
public class Sensor {

	boolean active;
	
	void activate() { // Initially sensors are inactive
		
		active = true;
		
	}
	
	void deactivate() { 
		
		active = false;
	}
	
	boolean state() {
		
		return active;
		
	}
	
	boolean is_inactive() {
		
		return !active;
		
	}
	
	
	
}

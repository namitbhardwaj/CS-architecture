
public class infiltrator {

	Sensor Curr = new Sensor();
	Sensor FL = new Sensor();
	Sensor FR = new Sensor();
	Sensor F = new Sensor();

	
	boolean is_all_clear() {
		
		return Curr.is_inactive()&(FL.is_inactive() | FL.is_inactive() | F.is_inactive());
		
	}
	
	boolean first_try() {
		
		return (FL.is_inactive() | FR.is_inactive() | F.is_inactive());
		
	}
	
}

import java.util.Random;


public class simulation {
	
	
	public int calculateTime(double p, int W) {
		
		
		
		int t = 0;
		
		infiltrator player = new infiltrator();
				
		boolean first = true; // initially the player in safe area
		
		border B = new border(W);
		
		boolean wait = false; // to wait or not
		
		while(W>0) {
			
			if (t % 10 == 0) {

				B.deploy_sensor(player, p); // check every 10 seconds to deploy sensors
				
			}
			
			if (first == true) { // check only the three sensors in front 
				
				
				if (player.first_try()) {
					
					System.out.println("Reached first try");
					W--; // player moved forward
					first = false;
					
				}
				else {
					
					wait = true; // player won't move and will scan again the next second
					
				}
				
				
			}
			else { // check current sensor and the 3 in the front 
				
				if (player.is_all_clear()) {

					System.out.println("Reached all clear");
					W--;
					
				}
				else {
					
					wait = true;
					
				}
				
			}
			
			if (wait == true) { //  to not move and waste the second
				
				t++; // only one increment
				
			}
			else { // Move accepted and will now take 9 seconds to move 
				
				t+=10; // 10 seconds added (1 for checking and 9 to move)
				
			}
			
			//System.out.println(W);

		}
		
		return t;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		simulation s1 = new simulation();
		
		System.out.println("HALLO what");
		
		
		int time = s1.calculateTime(0.7, 5);
		
		
		System.out.println(time);

	}

}

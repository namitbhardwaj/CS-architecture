import java.util.Random;

public class border {
	
	int width;
	
	border(int W) { // constructor to take value width
		
		width = W;
		
	}
	
	int ret_width() { // returns width
		
		return width; 
	}
	
	void deploy_sensor(infiltrator player, double p) {
		
		Random randomNum = new Random(); 
		
		if (randomNum.nextDouble() < p) { // whether to activate Front sensor
			
			player.F.activate();
			
		}
		else {
			
			player.F.deactivate();
			
		}
		
		if (randomNum.nextDouble() < p) { // whether to activate Front Left sensor
			
			player.FL.activate();
			
		}
		else {
			
			player.FL.deactivate();
			
		}
		
		if (randomNum.nextDouble() < p) { // whether to activate Front Right sensor
			
			player.FR.activate();
			
		}
		else {
			
			player.FR.deactivate();
			
		}
		
		
		if (randomNum.nextDouble() < p) { // whether to activate Current sensor
			
			player.Curr.activate();
			
		}
		else {
			
			player.Curr.deactivate();
			
		}
		
			
		
		
	}
}

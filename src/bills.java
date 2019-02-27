
import javax.swing.JOptionPane;


public class bills {
	private final double QUARTER = 0.25, DIME = 0.1, NICKEL = 0.05, PENNY = 0.01, THRESHOLD = 0.01;
	
	
	public static void main(String[] args1){
		double amt = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you would like in change:"));
		
		makeChange(amt);
	}
	
	public static void makeChange(double amount){
		double trackAmount = 0.00;
		//while(!compareTo(amount, trackAmount)){
			
		//}
	}
	
	public boolean compareTo(double a, double b){
		if(Math.abs(a - b) < THRESHOLD){
			return true;
		}
		else{
			return false;
		}
	}
}

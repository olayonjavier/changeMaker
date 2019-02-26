
public class bills {
	public static double hundreds(double change){
		double output = 0;
		while(change - 100 > 0){
			output = change - 100;
		}
		return output;
	}
}

package exercise;

public class Ex11_3_1_Health {
	public static double bimValue(double weight, double height){
		double calBMI = 0;
		
		calBMI = weight / Math.pow(height, 2);
		return calBMI; 
	}
}

package exercise;

public class Ex11_2_1_Health {
	public static void bmi(double weight, double height){
		double bmiData;
		bmiData = weight / Math.pow(height, 2);
		System.out.printf("BMI = %3.1f", bmiData);
	}
}

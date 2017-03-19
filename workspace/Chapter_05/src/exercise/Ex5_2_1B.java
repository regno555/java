package exercise;
import lib.Input;

public class Ex5_2_1B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double height, weight;
		
		height = Input.getDouble("身長(m)");
		weight = Input.getDouble("体重(kg)");
		
		System.out.println("BMI = " + (weight / (height * height)));
	}

}

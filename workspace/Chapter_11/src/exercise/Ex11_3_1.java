package exercise;

import lib.Input;

public class Ex11_3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight, height;
		weight = Input.getDouble("体重(kg) = ");
		height = Input.getDouble("身長(m) = ");
		System.out.printf("BMI = %4.1f", Ex11_3_1_Health.bimValue(weight, height));
	}

}

package lib;
import exercise.Ex11_3_1_Health;

public class Ex11_3_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight, height;
		weight = Input.getDouble("体重を入力 = ");
		height = Input.getDouble("身長を入力 = ");
		System.out.printf("BMI = %4.1f",  Ex11_3_1_Health.bimValue(weight, height));
	}

}

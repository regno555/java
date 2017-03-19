package exercise;

public class Ex11_2_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double weight = 0;
		double height = 0;
		weight = lib.Input.getDouble("体重を入力 = ");
		height = lib.Input.getDouble("身長を入力 = ");
		Ex11_2_1_Health.bmi(weight, height);
	}

}

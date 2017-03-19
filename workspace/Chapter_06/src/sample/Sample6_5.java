package sample;
import lib.Input;

public class Sample6_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double data = Input.getDouble("値");
		double sq = Math.sqrt(data);
		System.out.printf("平方根 = %6.3f",  sq);
	}

}

package exercise;
import lib.Input;

public class Ex6_2_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double a = Input.getDouble("A = ");
		double b = Input.getDouble("B = ");
		double ans = Math.sqrt(a) - Math.sqrt(b);
		
		System.out.printf("%6.3f", ans);
		
	}

}

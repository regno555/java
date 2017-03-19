package exercise;
import lib.Input;

public class Ex4_4_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double hankei = Input.getDouble();
		double takasa = Input.getDouble();
		double taiseki = hankei * hankei * 3.14 * takasa;
		System.out.println(taiseki);
	}

}

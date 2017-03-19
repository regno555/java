package exercise;
import lib.Input;

public class Ex5_2_1A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double eigo, suugaku, kokugo, total, heikin;
		
		eigo = Input.getDouble("英語");
		suugaku = Input.getDouble("数学");
		kokugo = Input.getDouble("国語");
		
		total = eigo + suugaku + kokugo;
		heikin = total / 3;
		
		System.out.println("合計点 = " + total);
		System.out.println("平均点 = " + heikin);
		
	}

}

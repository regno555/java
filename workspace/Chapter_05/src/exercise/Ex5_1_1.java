package exercise;
import lib.Input;

public class Ex5_1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double eigo, suugaku, kokugo, total;
		
		eigo = Input.getDouble();
		suugaku = Input.getDouble();
		kokugo = Input.getDouble();
		total = eigo + suugaku + kokugo;
		
		System.out.println(total);
		System.out.println(total / 3);
		
	}

}

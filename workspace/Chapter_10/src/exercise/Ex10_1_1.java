package exercise;
import lib.Input;

public class Ex10_1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int datacount = 0;
		double data = 0;
		while((data = Input.getDouble("データ入力 = ")) != 0){
			++datacount;
		}
		System.out.println("入力件数 = " + datacount);
	}

}

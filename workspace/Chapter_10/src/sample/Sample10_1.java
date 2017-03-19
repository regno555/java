package sample;
import lib.Input;

public class Sample10_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int total = 0, data;
		while((data = Input.getInt("整数入力 = ")) != 0){
			total += data;
		}
		System.out.println("合計 = " + total);
	}

}

package sample;
import lib.Input;

public class Sample10_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data, total = 0;
		while((data = Input.getInt("正の数を入力して合計を求めます。 正の数を入力 = ")) != 0){
			if(data < 0){
				System.out.println("continue");
				continue;
			}
			total += data;
		}
		System.out.println("正の数の合計 = " + total);
	}

}

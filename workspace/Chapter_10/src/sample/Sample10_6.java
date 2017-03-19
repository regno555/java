package sample;
import lib.Input;

public class Sample10_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data, total = 0;
		while((data = Input.getInt("数値を入力 = ")) != 0){
			if(data < 0){
				System.out.println("break");
				break;
			}
			total += data;
		}
		System.out.println("合計 = " + total);
	}

}

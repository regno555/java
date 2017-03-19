package exercise;
import lib.Input;

public class Ex10_6_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int num, total = 0;
		while((num = Input.getInt("整数を入力 = ")) != 0){
			if(total + num > 100){
				break;
			}
			total += num;
		}
		System.out.println("100を超える前までの合計 = " + total);
	}

}

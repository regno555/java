package exercise;
import lib.Input;

public class Ex9_1_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int data;
		data = Input.getInt("整数を入力 = ");
		if((data % 3) == 0){
			System.out.println("3の倍数です。");
		}else{
			System.out.println("3の倍数ではありません。");
		}
		
	}

}

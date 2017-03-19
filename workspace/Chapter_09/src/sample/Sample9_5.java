package sample;
import lib.Input;

public class Sample9_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = Input.getInt("数値を入力 = ");
		if((n <= 100) && (n%8 == 0)){
			System.out.println(n + "は、100以下の8の倍数です。");
		}else{
			System.out.println(n + "は、100以下の8の倍数でないです。");
		}
	}

}

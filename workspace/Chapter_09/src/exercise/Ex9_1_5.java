package exercise;
import lib.Input;

public class Ex9_1_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = Input.getInt("整数(a)を入力 = ");
		int b = Input.getInt("整数(b)を入力 = ");
		double ans = a * a - b;
		
		if(ans >= 0){
			System.out.println("結果は、正の値（もしくは0）で = " + ans);
		}else{
			System.out.println("結果は、負の値で = " + ans);
		}
	}

}

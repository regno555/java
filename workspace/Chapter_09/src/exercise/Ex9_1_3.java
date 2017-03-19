package exercise;
import lib.Input;

public class Ex9_1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n1 = Input.getInt("整数n1を入力 = ");
		int n2 = Input.getInt("整数n2を入力 = ");
		if (n1 >= n2){
			System.out.println("大きい（同じ場合含む）値は、 = " + n1);
		}else{
			System.out.println("大きい値は、 = " + n2);
		}
	}

}

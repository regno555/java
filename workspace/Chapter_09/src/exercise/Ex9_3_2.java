package exercise;
import lib.Input;

public class Ex9_3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kokugo = Input.getInt("国語の点数を入力 = ");
		int suugaku = Input.getInt("数学の点数を入力 = ");
		
		if((kokugo >= 80) || (suugaku >= 80)){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
	}

}

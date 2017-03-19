package exercise;
import lib.Input;

public class Ex9_3_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int kokugo = Input.getInt("国語の点数を入力 = ");
		int suugaku = Input.getInt("数学の点数を入力 = ");
		double heikin = (kokugo + suugaku) / 2; 
		
		if((heikin >= 60) && (!((kokugo < 50) || (suugaku < 50)))){
			System.out.println("合格");
		}else{
			System.out.println("不合格");
		}
	}

}

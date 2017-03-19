package exercise;
import lib.Input;

public class Ex9_4_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		double weight = Input.getDouble("重量を入力 = ");
		
		if(weight >= 5){
			System.out.println(weight + "取り扱いなし");
		}else if(weight >= 4){
			System.out.println(weight + "kg 700円");
		}else if(weight >= 2){
			System.out.println(weight + "kg 500円");
		}else{
			System.out.println(weight + "kg 300円");
		}
	}

}

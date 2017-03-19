package exercise;
import lib.Input;

public class Ex9_1_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int number;
		number = Input.getInt("整数を入力（100以上か判定） = ");
		System.out.print("入力値は、100以上 = ");
		System.out.println(number >= 100);
		
		System.out.print("入力値は、50未満 = ");
		System.out.println(number < 50);
		
		System.out.print("入力値は、200に等しい = ");
		System.out.println(number == 200);
		
		System.out.print("入力値は、7の倍数 = ");
		System.out.println(number % 7 == 0);
		
		double data;
		data = Input.getInt("整数を入力（平方根が2.0より大きい？か判定） = ");
		System.out.print("平方根が2.0より大きい = ");
		System.out.println(Math.sqrt(data) > 2.0);
		
		double data1, data2;
		data1 = Input.getDouble("data1 を入力 = ");
		data2 = Input.getDouble("data2を入力 = ");
		if(data1 == data2){
			System.out.println("data1 と data2　は、等しいです。");
		}else{
			System.out.println("data1 と data2 は、同じでないです。");
		}
		if(data1 <= Math.pow(data2, 3)){
			System.out.println("data1 は、 data2の3乗よりちいさい。");
		}else{
			System.out.println("data1 は、data2の３乗以上。");
		}
			
	}

}

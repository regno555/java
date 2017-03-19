package sample;
import lib.Input;

public class Sample5_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double temp1 = Input.getDouble("1月の平均気温");
		double temp2 = Input.getDouble("2月の平均気温");
		double temp3 = Input.getDouble("3月の平均気温");
		
		System.out.println("1月\t2月\t3月\t");
		System.out.print(temp1 + "\t");
		System.out.print(temp2 + "\t");
		System.out.print(temp3 + "\n");
		
	}

}

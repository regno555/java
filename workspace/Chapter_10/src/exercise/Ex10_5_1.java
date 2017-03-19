package exercise;

public class Ex10_5_1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double [] data = {12.5, 7.2, 5.6, 15.0, 9.1};
		double total = 0;
		for(double d : data){
			total += d;
		}
		System.out.printf("合計 = %4.1f\n", total);
		System.out.printf("平均 = %4.1f", total / data.length);
	}

}

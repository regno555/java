package exercise;

public class Ex8_5_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] kokugo = {88, 58, 63, 95, 77};
		int total = 0;
		for (int i = 0; i < kokugo.length; i++){
			total += kokugo[i];
		}

		System.out.println("合計 = " + total);
		System.out.println("平均 = " + total / kokugo.length);
		
		for (int i = 0; i < kokugo.length; i++){
			System.out.println("点数 = " + kokugo[i]);
		}
	}

}
